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
	
		stopListPath = args[0];

		for(int i = 2;i<args.length;i++){
			
			DocQueue.add(args[i]);
		
		}
	
	}
		
	Setup s = new Setup(DocQueue, stopListPath);
	}
	//if(args[0].equals("-d")){
	

    }
}
