package program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_1 {
	public static void main(String[] args) throws IOException{
		ArrayList al = new ArrayList<>();
		FileInputStream fis = null;
		
			fis = new FileInputStream("C:\\Users\\bhara\\Downloads\\Mesh.txt");
		
		Scanner sc=new Scanner(fis);
		while(sc.hasNext()) {
			//System.out.println(sc.nextLine());
			String a = sc.nextLine();
			al.add(a);	
		}
		//System.out.println(al);
		
		String path="C:\\Users\\bhara\\Downloads\\file1.txt"; 
		FileOutputStream fos1 = new FileOutputStream(path);
		
		String path1="C:\\Users\\bhara\\Downloads\\file2.txt"; 
		FileOutputStream fos2 = new FileOutputStream(path1);
		
		String path2="C:\\Users\\bhara\\Downloads\\file3.txt"; 
		FileOutputStream fos3 = new FileOutputStream(path2);
		
		String path3="C:\\Users\\bhara\\Downloads\\file4.txt"; 
		FileOutputStream fos4 = new FileOutputStream(path3);
		
		String path4="C:\\Users\\bhara\\Downloads\\file5.txt"; 
		FileOutputStream fos5 = new FileOutputStream(path4);
		
		String path5="C:\\Users\\bhara\\Downloads\\file6.txt"; 
		FileOutputStream fos6 = new FileOutputStream(path5);
		
		String path6="C:\\Users\\bhara\\Downloads\\file7.txt"; 
		FileOutputStream fos7 = new FileOutputStream(path6);

			for(int i=0;i<al.size();i++) {
				Object q = al.get(i);
				String str1 =(String)q;
				char[] ch = str1.toCharArray();
				
				if(!str1.contains(".") && str1.contains("A0")) {
					byte[] b = str1.getBytes();
					fos1.write(b);
					}
				else
				{
					String[] s = str1.split(" ");
					//for (int j = 0; j < s.length; j++)
						if(s[0].length()==7 && s[0].contains(".")) {
							byte[] b = str1.getBytes();
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
				
				
//				else if(str1.contains(".")) {
//					byte[] b = str1.getBytes();
//					fos2.write(b);
//				}
//				
//				else if(str1.contains("A02")) {
//					byte[] b = str1.getBytes();
//					fos2.write(b);
//				}
//				
//				else if(str1.contains("A03")) {
//					byte[] b = str1.getBytes();
//					fos3.write(b);
//				}
//				else if(str1.contains("A04")) {
//					byte[] b = str1.getBytes();
//					fos4.write(b);
//				}
			}
			
			fos1.close();
			fos2.close();
			fos3.close();
			fos4.close();
			//System.out.println("file created successfully");
		
		
		
	}
}
