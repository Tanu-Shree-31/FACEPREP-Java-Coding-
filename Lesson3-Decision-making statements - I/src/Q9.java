import java.util.Scanner;

/*Lab Allocation III
There are 3 labs in the CSE department are L1, L2, and L3 with a seating capacity of x, y, and z. 
A single lab needs to be allocated to a class of 'n' students. How many of the 3 labs can accommodate 
'n' students?

Input format:
Input consists of 4 integers
The first input denotes the seating capacity of L1(x)
The second input denotes the seating capacity of L2(y)
The third input denotes the seating capacity of L3(z)
The fourth input denotes the number of students(n)

Output format:
Print the number of labs which can accommodate the 'n' number of students
Refer the Sample output for formatting

Sample Input
30
40
20
25

Sample Output:
2 
*/

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int n=sc.nextInt();
		if(n<=x&&n<=y&&n<=z)

	       {

	           System.out.println("3");

	       }

	       else if((n<=x&&n<=y) ||(n<=x&&n<=z) ||(n<=y&&n<=z))

	       {

	           System.out.println("2");

	       }

	       else if(n<=x||n<=y||n<=z)

	       {

	           System.out.println("1");

	       }

	       else

	       {

	           System.out.println("0");

	       }
		}
	}

