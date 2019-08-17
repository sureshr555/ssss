package example;

import java.util.Arrays;

public class ArrayMIN {

	
public static void main(String[] args)
{

		int[] arr ={30,50,40,10,20};
		int small=arr[0];
 
        for(int i=0;i<arr.length;i++) {
        if(arr[i]<small) {
        small=arr[i];
        }}   
        System.out.println("First Smallest Number: "+small);
 
        int sec_Small=arr[0];
 
        for(int i=0;i<arr.length;i++)  { 	
        if(arr[i]<sec_Small && arr[i]!=small){
        sec_Small=arr[i];
        }}
        System.out.println("Second Smallest Number: "+sec_Small);
        
        int third_Small=arr[0];
         
        for(int i=0;i<arr.length;i++) {
        if(arr[i]<third_Small && arr[i]!=sec_Small && arr[i]!=small){
        third_Small=arr[i];
        }}
       
        System.out.println("Third Smallest Number: "+third_Small); 
		}}




		/*
		
		int arr[]={12,433,3,5,6,67,78};
		
		int min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j= i+1; j < arr.length; j++) {
				
				
			if(min>arr[i])
			{
				min=arr[i];
				arr[i]=arr[j];
				arr[j]=min;
			}
		}
		}
	
		int ndmin=min;
		System.out.println(min);
		for (int i = 0; i < arr.length; i++) {
			
			
			for (int j = 0; j < arr.length; j++) {
				
				if(ndmin>arr[i])
				{
					ndmin=arr[i];
				
				}
			}
		}
		
		System.out.println(ndmin);
		
	}
}*/