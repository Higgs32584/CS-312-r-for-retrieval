/**
* This is my code! It’s goal is to ....
* CS 312 - Assignment 9
* @Michael Higgins
* version 1.0
*/

import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.Set;
import java.util.PriorityQueue;
import java.io.FileNotFoundException;
public class Setup {
	
	HashMap<String,Set<String>> map;
	
	HashSet<String> stopList;

	public Setup(PriorityQueue<String> docList, String stopList) throws FileNotFoundException{
		
		setupStoplist(stopList);

		while(!docList.peek().equals( null)){
	
		setupFile(docList.poll());
		}	
			
	}
	
	public void setupStoplist(String stopAdr) throws FileNotFoundException{
	
	File stopFile = new File(stopAdr);
        
        Scanner myStopReader = new Scanner(stopFile);

        while (myStopReader.hasNextLine()) {

            String data = myStopReader.nextLine();

            stopList.add(data);

        }
        myStopReader.close();
}
	public void setupFile(String docAddress) throws FileNotFoundException{
	
	File doc = new File(docAddress);

	Scanner myReader = new Scanner(doc);

	while(myReader.hasNextLine()){
		
		String data = myReader.nextLine();
		
		data = data.toLowerCase();
		
		if(!stopList.contains(data)){
		
			if(map.get(data).equals(null)){
		
				HashSet<String> Collection = new HashSet();
				
				Collection.add(docAddress);
				
				map.put(data,Collection);
			}
			else{
			map.get(data).add(docAddress);
			
			
			}

		}
	
	}
	

	}
	public String returnIndex(){
	return map.toString();
		
	} 
}


