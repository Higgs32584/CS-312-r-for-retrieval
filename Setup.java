/**
 * This is my code! Itâ€™s goal is to ....
 * CS 312 - Assignment 9
 * @Michael Higgins
 * version 1.1
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;
public class Setup {

    HashMap<String,Set<String>> map;

    HashSet<String> stopList;

    public Setup(PriorityQueue<String> docList, String stopAdr) throws FileNotFoundException{

        stopList = setupStoplist(stopAdr);

        map = setupFile(docList);

    }

    public HashSet<String> setupStoplist(String stopAdr) throws FileNotFoundException{

        File stopFile = new File(stopAdr);

        Scanner myStopReader = new Scanner(stopFile);

        String data = "";

        HashSet<String> localSet = new HashSet<String>();

        while (myStopReader.hasNextLine()) {


            data = myStopReader.nextLine();
            
            localSet.add(data);

        }
        myStopReader.close();

        return localSet;
    }



    public HashMap<String,Set<String>>  setupFile(PriorityQueue<String> docQueue) throws FileNotFoundException{

        HashMap<String,Set<String>> map = new HashMap<String, Set<String>>();

        while(docQueue.peek() != null){

            File doc = new File(docQueue.poll());

            Scanner myReader = new Scanner(doc);

	    

            while(myReader.hasNextLine()) {

                String[] priority = myReader.nextLine().split(" ");

                for (String data : priority) {

                    data = data.toLowerCase();


                    if (checkStopList(data)) {

                        if (!map.containsKey(data)) {

                            HashSet<String> Collection = newCollection(doc.getName());

                            map.put(data, Collection);
                        } else {
                            map.get(data).add(doc.getName());


                        }

                    }

                }

            }
        }
        return map;
    }
    public boolean checkStopList(String word){

        return !stopList.contains(word);

    }
    public String returnIndexasString(){

        return map.toString();

    }
    public HashSet<String> newCollection(String adr){

        HashSet<String> set = new HashSet<String>();

        set.add(adr);

        return set;


    }
    public HashMap<String,Set<String>> returnIndexAsMap(){

        return map;

    }
}


