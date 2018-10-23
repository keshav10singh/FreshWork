package com.qakeshav.javaconcept.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Createing object of file class and pass Text File location in argument
		File file=new File("Test1.txt");
		
		//Initializing charCount, wordCount and lineCount to 0
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		BufferedReader br=null;
		
		try {
			FileReader fr=new FileReader(file);
			//Creating BufferedReader object
		 br=new BufferedReader(fr);
			
			String currentLine=br.readLine();
			
			while(currentLine!=null) {
				//updating line count
				lineCount++;
				
				//Getting number of words in currentLine
				String[] words=currentLine.split(" ");
				//updating wordCount
				wordCount=wordCount+words.length;
				
				//Iterating each word using for each loop
				for(String word:words) {
					//Updating the char count
					charCount=charCount+word.length();
				}
				currentLine=br.readLine();
			}
			//Printing charCount,linCount,wordCount
			System.out.println("Number of character in Text File :"+charCount);
			System.out.println("Number of word in Text File :"+wordCount);
			System.out.println("Number of line in Text File :"+lineCount);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
	br.close();// closing buffer reader
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
