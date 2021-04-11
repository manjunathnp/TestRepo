package com.test;

public class StringDemo1 
{
	public static void main(String[] args) {
		String text = "tomorrow";
		String extext = "";
		int count = 0;
		
		char ch[] = text.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] == 'o')
			{
				count++;
				for(int j=1; j<=count; j++)
				{
					extext = extext + '$';
				}
				
			}
			else if(ch[i] != 'o')
			{
				extext = extext + ch[i];
			}
		}
		
		System.out.println(extext);
	}

}
