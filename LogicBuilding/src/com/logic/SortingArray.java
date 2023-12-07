package com.logic;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int[] arr={56,37,46,73,28,93};
		System.out.println("Before Sorting An Array Elements:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting An Array Elements:"+Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorting An Array Elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
