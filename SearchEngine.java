/**
* This is my code! It’s goal is to ....
* CS 312 - Assignment 9
* @Michael Higgins
* Version 1.0
*/

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
public class SearchEngine{
	HashMap<String, Set<String> > map;
	public SearchEngine(HashMap<String,Set<String>> map){
	this.map=map;
	
	}
	public void searchSingle(String search){
	if(map.containsKey(search)){
		System.out.print(map.get(search).toString());
	
	}
	
	
	}
	}
