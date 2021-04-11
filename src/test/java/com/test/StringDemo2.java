package com.test;

public class StringDemo2 
{
	public static void main(String[] args) {
		String input = "tomorrow";
		char strChar[] = input.toCharArray();
		
		for(int i=0; i<strChar.length; i++)
		{
			if(input.charAt(i) == 'o')
			{
				int k = i;
				for(int j=k; j>0; j--)
				{
					char temp = strChar[j];
					strChar[j] = strChar[j-1];
					strChar[j-1] = temp;
				}
			}
		}
		System.out.println(String.valueOf(strChar));
	}
	
}
