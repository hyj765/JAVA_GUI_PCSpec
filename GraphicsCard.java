package computerviewer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GraphicsCard {
			class disk
			{	
				
				public String diskname;
				public String Freespace;
				public String Filesystem;
				public String TotalSpace;
				disk()
				{
					this.diskname = "";
					this.Filesystem = "";
					this.Freespace = "";
					this.TotalSpace = "";
				}
			}
			  int Dcount = 0;
			disk[] di = new disk[100];
	          String didi = "";
			  String GPU = "";
	          String Cm= "";
	          String CPU = "";
	          String Memory = "";
	          String OS = "";
	          String Displa="";
	           String filePath = "C:\\comput.txt";
	           File gpu = new File("C:\\comput.txt");
	         public Boolean ComputerCheck() throws InterruptedException, FileNotFoundException {
	        	 
	           if(!gpu.exists()){
	        	  JOptionPane.showInternalMessageDialog(null, "-- Excuting Progress Wait for a Seconds--");
	           ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","dxdiag","/t",this.filePath);
	           System.out.println("-- Executing dxdiag command --");
	           Process p;
			try {
				p = pb.start();
				p.waitFor();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          
	           }
	           BufferedReader br = new BufferedReader(new FileReader(this.filePath));
	           String line;
	           System.out.println(String.format("-- Printing %1$1s info --",this.filePath));
	           try {
	        	   
				while((line = br.readLine()) != null){
					   if(line.trim().startsWith("Processor")){
						   this.CPU = line.trim().substring(11,39);
					   }
				       if(line.trim().startsWith("Card name:")){
				    	   GPU = line.trim().substring(11);
				       }
				       else if(line.trim().startsWith("Current Mode:")){
				          Cm = line.trim().substring(13);
				       }
				       else if(line.trim().startsWith("Memory:"))
				       {
				    	   Memory = line.trim().replaceAll("[^0-9]","");
				       }
				       else if(line.trim().startsWith("Operating System:"))
				       {
				    	   OS = line.trim().substring(18,40);
				       }
				       else if(line.trim().startsWith("Display Memory"))
				       {
				    	   Displa = line.trim().replaceAll("[^0-9]","");
				       }
				       
				       if(line.trim().startsWith("Disk"))
				       {	int i = 0;
				    	   while((line = br.readLine())!= null)
				    	   {
				    		   if(line.trim().startsWith("System Devices"))
				    		   {
				    			   break;
				    		   }
				    		   System.out.println(line);
				    		   if(line.trim().startsWith("Drive:"))
						       {	
				    			   	 di[i] = new disk();
				    			   	 this.Dcount++;
						    	 	 di[i].diskname = line.trim().substring(7,8);
						    	 	 
						       }else if(line.trim().startsWith("File System:"))
						       {
						    	   di[i].Filesystem = line.trim().substring(12);
						    	   i++;
						       }else if(line.trim().startsWith("Free Space"))
						       {
						    	   di[i].Freespace = line.trim().replaceAll("[^0-9?.|*GB]","");
						       }else if(line.trim().startsWith("Total Space")) {
						    	   di[i].TotalSpace = line.trim().replaceAll("[^0-9?.|*GB]","");
						       }
				    	   }
				       }
				          
				   }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	           return true;   
	         }
}

