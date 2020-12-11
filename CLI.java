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
	
	long startTime = System.currentTimeMillis();

	String stopListPath="";
	
	PriorityQueue<String> docQueue = new PriorityQueue<String>();
	
	if(!args[0].equals("-d")){
	
		stopListPath = args[0];

		for(int i = 1; i < args.length; i++){
		
			docQueue.add(args[i]);

	
		
		}
	}
	
	if(args[0].equals("-d")){
	
		stopListPath = args[1];

		for(int i = 2;i<args.length;i++){
			
			docQueue.add(args[i]);

		
		}

	}
	
	Setup s = new Setup(docQueue,stopListPath);
	
	long stopTime = System.currentTimeMillis();
	
	long elapsedTime = stopTime - startTime;
	
	System.out.println("Building the Inverted Index took" + elapsedTime + "ms");
	
	Scanner sc = new Scanner(System.in);
	
	String input = sc.next();
	
	long startTime2 = System.currentTimeMillis();
	
	SearchEngine se = new SearchEngine(s);

	System.out.println(se.searchSingle(input));

	if(args[0].equals("-d")){
	
		System.out.print(s.returnIndexasString());
	}
	long stopTime2 = System.currentTimeMillis();

	long elapsedTime2= stopTime2- startTime2;

	System.out.println("finding the current word took"+elapsedTime2+"ms");
	
    }
}
