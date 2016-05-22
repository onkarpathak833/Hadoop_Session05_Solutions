package Onkar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
/*
 Solution for Session 05 Assignment 03.
 Problem Statement :: 
 
 String line=”Hadoop is open source frame work ,Hadoop is good framework for handling big data”;
1. Class a sample class with name String_demo and inside the main method perform the following operation
 Split the line by space and store in a new string array
 Count number of occurrence of word Hadoop in the given string
 Replace the ‘,’with space in the given string
 Create a array list with generic string and store the spitted string inside it

*/
public class String_demo {

	public static void main(String args[]) {
		
		String line = "Hadoop is a open source frame work , Hadoop is good framework for handling big data";
	    if(line.contains(",")) {
	    	line = line.replaceAll(",", "").trim();
	    }
		StringTokenizer strToken = new StringTokenizer(line);
	  String tokenArray[] = new String[strToken.countTokens()];
	  int count =0;
	  int countOfHadoop =0;
	 while(strToken.hasMoreTokens()) {
		 tokenArray[count] = strToken.nextToken();
		 String currentWord = tokenArray[count];
		 if(currentWord.equals("Hadoop")) {
			 countOfHadoop++;
		 }
		 count++;
	 }
	 System.out.println("String Array : "+tokenArray);
	 System.out.println("Count of hadoop : "+countOfHadoop);
	  line  = line.replaceAll(",", " ");
	  String splitteString[] = line.split("\\s");
	  List<String>  splittedList = new ArrayList<String>();
	  splittedList = Arrays.asList(splitteString);
	  
	  System.out.println("Size of string array and list is : "+splitteString.length+" : "+splittedList.size());;
	 
	}
	
}
