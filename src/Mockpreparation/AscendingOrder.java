package Mockpreparation;

import java.util.Scanner;

public class AscendingOrder {

	
	public static void main(String[] args) {
		
		
		int a[] = {100,3,42,25,7,1,44,4};
	
		int n=a.length;
		int temp;
		for (int i = 0; i < n; i++) {
			
			for (int j = i; j < n; j++) {
				
				if(a[i]<a[j]){
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}}}
				for (int  i = 0; i < n; i++) {
					
					System.out.println(a[i]);
				}}}
			