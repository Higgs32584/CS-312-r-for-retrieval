/**
* This is my code! It’s goal is to ....
* CS 312 - Assignment 9
* @Michael Higgins
* Version 1.0
*/

import java.util.HashSet;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.PriorityQueue;
public class CLI {
    public static void main(String[] args) throws FileNotFoundException{
	
	String stopListPath;
	
	PriorityQueue<String> DocQueue= new PriorityQueue<String>();
	
	if(!args[0].equals("-d")){
	
		stopListPath = args[0];

		for(int i = 1;i<args.length;i++){
		
			DocQueue.add(args[i]);
	
		
		}
	if(args[0].equals("-d")){
	
		stopListPath = args[1];

		for(int i = 2;i<args.length;i++){
			
			DocQueue.add(args[i]);
		
		}
	Setup s= new Setup(DocQueue,stopListPath);
	System.out.println(s.returnIndex());
	}
	}
	//if(args[0].equals("-d")){
	System.out.print("Can yall work??");

    }
}
