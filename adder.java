package cmpe102project;

import java.util.ArrayList;
import java.util.Scanner;

public class adder 
{
	public static Scanner scanner = new Scanner(System.in);
	private int num1;
	private int num2;
	private short [] num1Binary;
	private short [] num2Binary;
	
	public adder()
	{
		readAndAlloc();
			
	}
	public void readAndAlloc()
	{
		System.out.println("please enter # of bits for input data:");
		int bitNum = scanner.nextInt();
		num1Binary = new short [bitNum];
		num2Binary = new short [bitNum];
		int min = (int)(0-Math.round(Math.pow(2, bitNum-1)));
		int max = (int)(Math.round((Math.pow(2, bitNum-1)-1)));
		do
		{
			System.out.println("Please enter 2 numbers to be added, separated by space(-" 
		                       + min +" ~ "+ max +"):");
			num1 = scanner.nextInt();
		    num2 = scanner.nextInt();
		}
		while(num1<min||num2<min||num1>max||num2>max);
	}
	
	public short [] DtoBConverter(int n, short[] array)
	{
		int copy = n;
		n = Math.abs(n);
		int tmp = 1;
		int i = 0;
		while(2*tmp <= n)
		{
			tmp=tmp*2;
			i = i+1;
		}
		while(n>0)
		{
			if(n>=tmp)
			{
				array[array.length-1-i]=1;
				n = n - tmp;
			}				
			i = i-1;
			tmp = tmp/2;
		}
		if(copy < 0)		
		{
			for(int j = 0;j<array.length;j++)
			{
				if(array[j] == 0)
					array[j] =1;
				else
					array[j] = 0;
			}
		}
		return array;
	}
	
	
	public static void main(String[] args) 
	{
		adder a1 = new adder();

	}

}
