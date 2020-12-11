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
    public String searchSingle(String search){

        Set<String> docs = new HashSet<String>();
	    
	 if(reverseIndex.containsKey(search)){
		
		docs = reverseIndex.get(search);


		return "--- found in " + (docs == null ? 0 : docs.size()) +"documents";

        }
	return "--- found in " + (docs == null ? 0 : docs.size()) +"documents";



    }
        public String searchMulti(String search){
        
        String[] WordList = search.split(" ");

        Set<String> docs = new HashSet<String>();

            docs = reverseIndex.get(WordList[0]);
            
            for(int i = 1;i<WordList.length;i++){
                
                if(reverseIndex.containsKey(WordList[i])){
                    
                    docs.retainAll(reverseIndex.get(WordList[i]));
                }
            }
            return docs.toString();
    }
}


