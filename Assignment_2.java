import java.util.Arrays;

public class Assignment_2 {
public static void main(String[] args) {
	String s="C04.557.470.615.305";
	System.out.println("Input: "+ s);
	String s1=s.substring(0, 4);
	int c=0;
	String s2=s.substring(4);
	//System.out.println(s2);
	char[] ch = s2.toCharArray();
	Arrays.sort(ch);
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='.') {
			c++;
		}
		//System.out.println("count "+c+" ");
	}
	
	System.out.print("Output: "+s1);
		for (int j = ch.length-1; j >0; j--) {
			
			if(ch[j]!='.')
			{
				if(ch[j]>ch[j-1] &&ch[j]!=ch[c])
				{
					
					System.out.print(ch[j]+""+'.');
					//System.out.print(ch[j]);
					
				}
				else
					System.out.print(ch[j]);
			}
		}
		//System.out.print("=="+ch[4]);
		if(c==0) {
			System.out.println(ch[0]);
		}
	}
}

