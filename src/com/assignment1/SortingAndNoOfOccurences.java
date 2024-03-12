package com.assignment1;
import java.util.*;

public class SortingAndNoOfOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j] >  arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]  = temp;
				}
			}
		}
		int comp = arr[0];
		int cnt = 1;
		for(int i=1;i<n;i++)
		{
			if(comp == arr[i])
			{
				cnt++;
			}
			else
			{
				System.out.println(comp+":"+cnt);
				comp = arr[i];
				cnt = 1;
			}
		}
		System.out.println(comp+":"+cnt);
		sc.close();
	}

}
