import java.util.Scanner;

/*Swapping two numbers
Write a java program to get 2 numbers from the user and swap their values without any loss of data. 
You can make use of additional variable for swapping. Print the corresponding swapped values of the 
two numbers as output in the console.

Input format:
First input: an integer
Second input: an integer

Output format:
The output will be integers(swapped values)
*/

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		

	}

}
