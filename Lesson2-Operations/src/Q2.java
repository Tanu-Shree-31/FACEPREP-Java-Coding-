import java.util.Scanner;

/*Product and Division
Write a program to get 2 numbers from the user and calculate their product, quotient, and remainder 
using '*', '/' and '%' operators respectively. Print the corresponding product, quotient and remainder 
of the numbers as output in the console.

Input format:
First input: an integer
Second input: an integer

Output format:
The first output will be the product of two integers
The second output will be the quotient
The third output will be the remainder
*/

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

}
