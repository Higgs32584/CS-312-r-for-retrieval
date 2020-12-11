/**
* This is my code! It’s goal is to ....
* CS 312 - Assignment 9
* @Michael Higgins
* Version 1.0
*/


import java.util.HashMap;
import java.util.Set;


public class SearchEngine extends HashMap<String,Set<String>>{

    HashMap<String,Set<String>> reverseIndex;


    public SearchEngine(Setup s){

        reverseIndex = s.returnIndexAsMap();

    }
    public String searchSingle(String search){

        if(reverseIndex.containsKey(search)){
            
		return "Word "+ search+" Found in "+reverseIndex.get(search).size()+ "Documents";

        }
	return "Word"+search+"Found in 0 Documents";


    }
}


