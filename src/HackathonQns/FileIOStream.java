package HackathonQns;


	import java.awt.List;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;

public class FileIOStream {

		public static ArrayList<String> readFile(String sRPath) throws IOException {
			
			System.out.println(sRPath);
	        try(BufferedReader br = new BufferedReader(new FileReader(sRPath))){
	            ArrayList<String> listOfData = new ArrayList<>();
	            String d;
	            while((d = br.readLine()) != null){
	                listOfData.add(d);
	            }
	            return listOfData;
	        }
	    }
	      public static void createFile(File sPath) {
			
			try {
				//File obFile = new File("C:\\Users\\vijay\\eclipse-workspace\\JavaHackathon\\Write.txt");
				//System.out.println(obFile);
				boolean createFile = sPath.createNewFile();
				if(createFile)
					System.out.println("New File is Created");
				else
					System.out.println("Creating a File Comment: File already exists");
				
			  }catch(Exception e)	{
				System.out.println("Exception :"+e);
		    	}
				
		}

	    public static void writeFile(File sPath, ArrayList<String> data) throws IOException{
	    	
			FileWriter fw = new FileWriter(sPath);
	        try(BufferedWriter bw = new BufferedWriter(fw)) {
	        	for(int i=data.size()-1;i>=0;i--) {
	        		
	            //for(String str: data){
	                bw.append(data.get(i));
	                bw.newLine();
	            }
	        }
	        System.out.println("Now Written Successfully");
	    }

	    public static void main(String[] args) throws IOException {
	    	String sRPath = System.getProperty("user.dir")+"/Read.txt";
	    	String sWPath = System.getProperty("user.dir")+"/Write.txt";
	    	File obj = new File(sWPath);
	    	
	        ArrayList<String> data = readFile(sRPath);
	        createFile(obj);
	        writeFile(obj,data);
	        System.out.println(data);
	    }
	}
