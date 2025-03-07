/*Circle Intersection
Write a program to determines if two circles intersect each other.

Input format:
Input consists of 6 integers
The first input containing an integer which denotes the x-coordinate of the center of the first
circle. 
The second input containing an integer which denotes the y-coordinate of the center of the
first circle. 
The third input containing an integer which denotes the radius of the first circle. 
The next 3 integers denote the x,y, and radius of the second circle.

Output format:
The output consists of a single line which contains any of these 3 strings.
�Tangential�, �Overlap�, �Do not overlap�

Sample Input:
10
10
3
10
6
1

Sample Output:
Tangential
*/

import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int r1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int r2=sc.nextInt();
		int c=(int)(Math.sqrt(((x1-x2)*(x1-x2))+(y1-y2)*(y1-y2)));
		if(c==r1+r2)
		    System.out.println("Tangential");
		else if(c>r1+r2)
		    System.out.println("Do not overlap");
		else
		    System.out.println("Overlap");


	}

}
