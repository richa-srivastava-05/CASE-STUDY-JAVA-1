package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DemoPractice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
/*----> //Q1:WAP to find weather the no entered by user is even or odd.
		System.out.println("Enter number");
		double number=sc.nextDouble();
		if(number%2==0)
			System.out.println("Number entered is Even");
		else {
			System.out.println("Number entered is Odd");
		}*/
		
		
/*----> //Q2:WAP to swap the values of 2 nos.(Take input from user) eg a=10 b=20
		System.out.println("Enter two number to swap");
		double number1=sc.nextDouble();
		double number2=sc.nextDouble();
		System.out.println("Numbers before swapping a= "+number1+" b= "+number2);
		double temp;
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("Numbers after swapping a= "+number1+" b= "+number2);*/
		
		
/*----> //Q3.WAP to find the greatest between the 3 nos and display the output.
		System.out.println("Enter 3 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("The greatest of all three: "+(num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3)));*/
		
		
/*----> //Q4.WAP to find weather the character entered by user is a vowel or not.
		//If-else
		System.out.println("Enter a character");
		char input=sc.next().charAt(0);
		if(input=='a' || input=='A'|| input=='E'|| input=='e'||input=='i'|| input=='I'||input=='o'||input=='O'||input=='u'||input=='U') {
			System.out.println("Entered character is an vowel.");
		}
		else {
			System.out.println("Entered character is a consonant.");
		}*/
		
		
/*----> //Q5.WAP to print even nos from 1-50 using while loop.
		int i=1;
		while(i<=50) {
			if(i%2==0)
				System.out.print(i+" ");
			i++;
		}*/
		
		
		
/*----> //Q6.WAP to print odd nos from 50-100 using do while loop.
		int i=50;
		while(i<=100) {
			if(i%2!=0)
				System.out.print(i+" ");
			i++;
		}*/
		
		
/*----> //Q7.Given a number N, print sum of all even numbers from 1 to N.
		System.out.print("Enter the value of n ");
		long n=sc.nextLong();
		long sum=0;
		for(long i=0;i<=n;i=i+2) {
			sum=sum+i;
		}
		System.out.print("The sum of even numbers from 1 to n is: "+sum);*/
		
		
/*----> Q8. WAP to print the following patterns  
		//a.for n=4
		for(int i=1;i<=4;i++) {
			int n=i;
			while(n>0) {
				System.out.print(i);
				n--;
			}
			System.out.println("");
		}*/
		
		/*//for n=4 
		 for(int i=1;i<=4;i++) {
			int n=4;
			 while(n>0) {
					System.out.print("4");
					n--;
				}
				System.out.println("");
				}*/
		
		/*//for n=5
		for(int i=1;i<=5;i++) {
			for(int n=i;n<5;n++) {
				System.out.print(" ");
			}
			for(int x=0;x<i;x++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
				
		
/*----> //Q9.Revers an Array.
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		System.out.print("original array: ");
		for (int i = 0; i < n; i++) { 
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		System.out.print("Reversed array: ");
		for (int i1 = n-1; i1 >=0; i1--) { 
			System.out.print(array[i1]+" ");
          
		} */
		
		
/*----> //Q10.Swap the nos in Array.
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println("Enter size ");
		int n=sc.nextInt();
		System.out.println("Enter elements ");
		for(int i=0;i<n;i++)
			arr.add(sc.nextInt());
		System.out.println("Array before swapping: "+arr);  
        System.out.print("Enter index i : ");  
        int i = sc.nextInt();  
        System.out.print("Enter index j : ");  
        int j = sc.nextInt();       
        Collections.swap(arr, i, j);  
        System.out.println("List after swapping: "+arr);  */
         
        
		
/*----> //Q11.WAP to calculate and display the factorial of a no entered by user.
		int i,fact=1;
		System.out.println("Enter number:");
		  int number=sc.nextInt();   
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);  */
		
		
		
/*----> //Q12.WAP to check weather the no entered by user is prime or not.
		int i,m=0,flag=0;   
		System.out.println("Enter number");
		  int n=sc.nextInt();    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not a prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }   */
		
		
/*----> //Q13.Given an integer N, print all the prime numbers that lie in the range 2 to N 
		int  N, flag;
        System.out.println("Enter upper Value of N: ");
        N = sc.nextInt(); 
        System.out.println("Prime numbers between 2 and "+N+" are: ");
        for (int i = 2; i <= N; i++) {

            if (i == 1 || i == 0)
                continue;
            flag = 1;
 
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(i+" ");
        }*/
				  
				  
				  
//---->  //Q14.WAP to generate the reverse of a given number N. Print the corresponding reverse number.
					System.out.println("Enter number: ");	 
					long number=sc.nextLong();
					long rev_num = 0;
				  		while (number > 0) {
				  			rev_num = rev_num * 10 + number % 10;
				  			number = number / 10;
				  		}
				  		System.out.println("Reversed number: "+rev_num);  	
	
		
	}

}
