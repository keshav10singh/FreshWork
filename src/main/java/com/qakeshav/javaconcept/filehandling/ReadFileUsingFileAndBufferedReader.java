package com.qakeshav.javaconcept.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileAndBufferedReader {

public static void main(String[] args) {
		
		File file=new File("Test1.txt");
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			
			String line;
			while((line=br.readLine())!=null){
			System.out.println(line);
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		System.out.println("File Not Found"+file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file"+file.toString());
		}
	}

}
