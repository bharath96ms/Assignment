//2. Write a program that will take input string and generate a output string (as given below).
//Description: Group the same number in a group and render in decreasing order separated by dots. 
//Don't consider the alphanumeric set which is the 1st 3 characters.

import java.util.Arrays;

public class Assignment_2 {
public static void main(String[] args) {

//Eg1: String s="C04.557.470.615.305";
//Eg2: String s A01.236.500

//taking input string from user
Scanner sc = new Scanner(System.in);
//storing the string
String s = sc.nextLine();

//given input string 
System.out.println("Input: "+ s);

//keeping the first 3 characters and and initializing new string to variable s1
String s1=s.substring(0, 4);

//intiatializing c to take the count 
int c=0;

//storing string value from index of 4th position to variable s2
String s2=s.substring(4);

//converting substring to array
char[] ch = s2.toCharArray();

//sorting the array using sort(char ch) method
Arrays.sort(ch);

//loop to access each element
for(int i=0;i<ch.length;i++) {
	//check whether char equal to '.' and to calculate number of '.' character present in a string and take of count of the '.' character
	if(ch[i]=='.')//if true take count of number of '.' operators
		{
		c++;
	}
}
//output starts here
System.out.print("Output: "+s1);

//retriveing data from last index using for loop to sort it in an ascendind order
	for (int j = ch.length-1; j >0; j--) {
		
		if(ch[j]!='.')// checking where character not equal to '.'
		{
			//j index should be greater then j-1 index and ch[index] not equal to ch[count] or  
			//{C th index value should not equal to ch[index] ,easily we can sort till last but not least index}
			if(ch[j]>ch[j-1] &&ch[j]!=ch[c])//comparing the last character with the count of '.' character to print last character at the end.
			{
				//print charaters in descending order	
				System.out.print(ch[j]+""+'.');
			}
			else
				System.out.print(ch[j]);
		}
	}
	//if count is zero then print last index value or charater
	if(c==0) {
		System.out.print(ch[0]);
	}
}
}

