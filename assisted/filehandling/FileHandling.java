package assisted.filehandling;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileHandling 
{
	
			 public static void main(String[] args) throws IOException {
			  
			  DataInputStream dos=new DataInputStream(System.in);
			  
			   FileOutputStream fi=new FileOutputStream("Sample1.txt",true);
			   BufferedOutputStream bu=new BufferedOutputStream(fi);
			   
			            
			   
			   char ch;
			   //To write the data to the Sample1.txt file 
			   while((ch=(char)dos.read())!='@')
			   {
			    fi.write(ch);
			    System.out.print((char)ch);   
			   }
			   fi.close(); 
			   
			 
			   
			   
			 }

}

