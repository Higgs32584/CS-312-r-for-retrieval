/**
* This is my code! It’s goal is to ....
* CS 312 - Assignment 9
* @Michael Higgins
* Version 1.0
*/


import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;


public class SearchEngine extends HashMap<String,Set<String>>{

    HashMap<String,Set<String>> reverseIndex;


    public SearchEngine(Setup s){

        reverseIndex = s.returnIndexAsMap();

    }
    public String search(String search){
        
        String[] WordList = search.split(" ");

        Set<String> docs = reverseIndex.getOrDefault(WordList[0],null);
            
            for(int i = 1;i<WordList.length;i++){
                
                if(reverseIndex.containsKey(WordList[i])){
                    
                    docs.retainAll(reverseIndex.get(WordList[i]));
                }
		if(!reverseIndex.containsKey(WordList[i])){
		
			return "Words not present in list";
		
		}

           }
	   return docs.toString();
    }
}


