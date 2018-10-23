package com.qakeshav.javaconcept.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("Test1.txt");
		BufferedReader br=null;
		//Creating wordCountMap which holds words as keys and their occurrences as value
		HashMap<String,Integer> wordCountMap=new HashMap<String,Integer>();
		
		try {
			FileReader fr=new FileReader(file);
			//Createing Buffer Reader Object
			br=new BufferedReader(fr);
			//Reading the first line into currentLine
			String currentLine=br.readLine();
			
			while(currentLine !=null) {
				//Splitting the current line into words
				String[] words=currentLine.toLowerCase().split(" ");
				//Iterating on each word using 
				for(String word:words) {
					//if word is already present in wordCountMap, updating its count
					if(wordCountMap.containsKey(word)) {
						//otherwise inserting the word as key and 1 as its value
						wordCountMap.put(word, wordCountMap.get(word)+1);
					}
					else {
						wordCountMap.put(word, 1);
					}
				}
				currentLine=br.readLine();
			}
			//Getting the most repeated word and its occurance
			String mostRepeatedWord=null;
			int count=0;
			Set<Entry<String,Integer>> entrySet=wordCountMap.entrySet();
			for(Entry<String,Integer> entry:entrySet) {
				if(entry.getValue()>count) {
					mostRepeatedWord=entry.getKey();
					count=entry.getValue();
				}
			}
			System.out.println("The most Repeated Word: "+mostRepeatedWord);
			System.out.println("Number of occurances of Repeated Word: "+count);
		}
		catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
		
	}
	}
	}
