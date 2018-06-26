package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {
		
		final String newLine = System.getProperty("line.separator");
		final String outputName = "output.csv";
		
		File file = new File(outputName);
		file.delete();
		
		File directory = new File(".");
		File[] files = directory.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File directory, String name) {
				return name.endsWith(".csv");
			}
		});
		
		Scanner input;
		PrintWriter output = new PrintWriter(outputName, "UTF-8");
		String currentLine;
		
		for(int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
			input = new Scanner(new FileReader(files[i]));
			currentLine = input.nextLine();
			if(i == 0) {
				output.write(currentLine);
				output.write(newLine);
			}
			currentLine = input.nextLine();
			output.write(currentLine);
			output.write(newLine);
			input.close();
		}
		output.close();
	}
}
