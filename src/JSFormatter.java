package test_java;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class JSFormatter {
	public String m_fileString = "";
	public String[] m_lines;
	public int m_tabsNum;
	public JSFormatter(String content) {
		m_fileString = clearTab(content);
		m_tabsNum = 0;
	}
	public void format() {
		toLines(m_fileString);
		for (int i = 0; i < m_lines.length; i++) {
			m_lines[i] = getTabs(m_tabsNum) + m_lines[i];
			if (m_lines[i].contains("{")) {
				m_tabsNum += 1;
			}
			if (i + 1 < m_lines.length && m_lines[i+1].contains("}")){
				m_tabsNum -= 1;
			}
		}
	}
	public String formatted() {
		String resultStr = "";
		for (String str: m_lines) {
			resultStr += str;
			resultStr += "\n";
		}
		return resultStr.substring(0, resultStr.length()-1);
	}
	private String clearTab(String str) {
		return str.replaceAll("\t", "");
		
	}
	private void toLines(String content) {
		m_lines = content.split("\n");
	}
	private String getTabs(int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += "\t";
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
            System.out.println("Please type a source file name and a target file name");
            return;
        }
		String sourceFile = new String(args[0]);
		String targetFile = new String(args[1]);

    	String text = "";
    	try {
	        text = readFile(sourceFile, StandardCharsets.UTF_8);
        } catch (IOException e2) {
	        e2.printStackTrace();
        }
		JSFormatter formatter = new JSFormatter(text);
		formatter.format();
		String result = formatter.formatted();
		
		PrintWriter fout = null;
    	try {
	        fout = new PrintWriter(targetFile);
	        fout.print(result);
        } catch (FileNotFoundException e) {
	        e.printStackTrace();
        } finally {
        	fout.close();
        }
		
		
	}
	private static String readFile(String path, Charset encoding) throws IOException 
	{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
}
