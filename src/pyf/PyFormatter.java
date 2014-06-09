package pyf;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PyFormatter {
	public String m_fileString = "";
	public List<String> m_lines = new Vector<>();
	public int m_tabsNum;
	public String m_blockEndStr = "";
	public PyFormatter(String content, String blockEnd) {
		m_fileString = clearTab(content);
		m_tabsNum = 0;
		m_blockEndStr = blockEnd.toString();
	}
	public void format() {
		toLines(m_fileString);
		for (int i = 0; i < m_lines.size(); i++) {
			m_lines.set(i, getTabs(m_tabsNum) + m_lines.get(i));
			String thisLine = m_lines.get(i).trim();
			if (thisLine.length() == 0) {
				continue;
			}
			// not support reference after colon
			boolean hasColon = thisLine.charAt(thisLine.length()-1) == ':';
			boolean hasWhile = thisLine.contains("while");
			boolean hasIf = thisLine.contains("if");
			boolean hasFor = thisLine.contains("for");
			boolean hasDef = thisLine.contains("def");
			if ((hasWhile || hasIf || hasFor || hasDef) && hasColon) {
				m_tabsNum += 1;
			}
			if (m_lines.get(i).contains(m_blockEndStr)) {
				String string = m_lines.get(i);
				Pattern pattern = Pattern.compile(m_blockEndStr); //case insensitive, use [g] for only lower
				Matcher matcher = pattern.matcher(string);
				int count = 0;
				while (matcher.find()) {
					count++;
				}
				m_tabsNum -= count;
				if (m_lines.get(i).replaceAll("\\s", "").matches("^[;]+$")) {
					m_lines.set(i, ";");
				}
				else {
					m_lines.set(i, m_lines.get(i).replaceAll(m_blockEndStr, ""));
				}
				
			}
		}
	}
	public String formatted() {
		String resultStr = "";
		for (String str: m_lines) {
			if (str.equals(";") == false) {
				resultStr += str;
				resultStr += "\n";
			}
		}
		return resultStr.substring(0, resultStr.length()-1);
	}
	private String clearTab(String str) {
		return str.replaceAll("\t", "");
		
	}
	private void toLines(String content) {
		m_lines = new Vector<>(Arrays.asList(content.split("\n")));
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
    	PyFormatter formatter = new PyFormatter(text, ";");
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
