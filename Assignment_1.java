//1. Write a program to read the file to generate reports in multiple files in pair/ level wise (2 Pairs/ 3 
//Pairs/4 Pairs so on) . 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_1 {
public static void main(String[] args) throws IOException{
	//instantiating ArrayList
	ArrayList al = new ArrayList<>();

	//read a txt file and pass the absolute path as parameter
	FileInputStream fis = new FileInputStream("C:\\Users\\bhara\\Downloads\\Mesh.txt");

	//scanner class is to read a file line by line 
	Scanner sc=new Scanner(fis);

	//hasNext() return boolean true until there is value
	while(sc.hasNext()){
		String a = sc.nextLine();
		//adding the string into a list 
		al.add(a);	
	}
	
	//writing the segreated data and stiring into a file
	String path="C:\\Users\\bhara\\Downloads\\file1.txt"; 
	FileOutputStream fos1 = new FileOutputStream(path);
	
	//writing the segreated data and string into a file
	String path1="C:\\Users\\bhara\\Downloads\\file2.txt"; 
	FileOutputStream fos2 = new FileOutputStream(path1);
	
	//writing the segreated data and string into a file
	String path2="C:\\Users\\bhara\\Downloads\\file3.txt"; 
	FileOutputStream fos3 = new FileOutputStream(path2);
	
	//writing the segreated data and stiring into a file
	String path3="C:\\Users\\bhara\\Downloads\\file4.txt"; 
	FileOutputStream fos4 = new FileOutputStream(path3);
	
	//writing the segreated data and string into a file
	String path4="C:\\Users\\bhara\\Downloads\\file5.txt"; 
	FileOutputStream fos5 = new FileOutputStream(path4);
	
	//writing the segreated data and string into a file
	String path5="C:\\Users\\bhara\\Downloads\\file6.txt"; 
	FileOutputStream fos6 = new FileOutputStream(path5);
	
	//writing the segreated data and string into a file
	String path6="C:\\Users\\bhara\\Downloads\\file7.txt"; 
	FileOutputStream fos7 = new FileOutputStream(path6);


	//loop is used to acesss the each element from the list 
		for(int i=0;i<al.size();i++) {
			Object q = al.get(i);
			//explicit typecasting of type String
			String str1 =(String)q;

			//check where string contains '.' operator and A0
			if(!str1.contains(".") && str1.contains("A0")) {
				//write data into file (byte array indexing wise)
				byte[] b = str1.getBytes();
				fos1.write(b);
				}

				//check where string contains '.' operator and finding the length
			else
			{
				//split method is used split the string from " " blank space from string.
				String[] s = str1.split(" ");
	
					if(s[0].length()==7 && s[0].contains(".")) {
						//converting string into byte array 
						byte[] b = str1.getBytes();
						//write data into file (byte array indexing wise)
						fos2.write(b);
					}
					else if(s[0].length()==11 && s[0].contains(".")) {
						byte[] b = str1.getBytes();
						fos3.write(b);
					}
					else if(s[0].length()==15 && s[0].contains(".")) {
						byte[] b = str1.getBytes();
						fos4.write(b);
					}
					else if(s[0].length()==19 && s[0].contains(".")) {
						byte[] b = str1.getBytes();
						fos5.write(b);
					}
					else if(s[0].length()==23 && s[0].contains(".")) {
						byte[] b = str1.getBytes();
						fos6.write(b);
					}
					else if(s[0].length()==27 && s[0].contains(".")) {
						byte[] b = str1.getBytes();
						fos7.write(b);
					}
					
				
			}
			
			
		}
		//closing the file
		fos1.close();
		fos2.close();
		fos3.close();
		fos4.close();	
	}
}
