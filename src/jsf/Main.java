package jsf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
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
