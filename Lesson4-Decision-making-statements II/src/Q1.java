import java.util.Scanner;

/*Mango tree I
Dora is interested so much in gardening and she plants more trees in her garden. She plants trees in a 
rectangular fashion with the order of rows and columns and numbered the trees in row-wise order. She planted 
the mango tree only in a 1st row, 1st column and last column. So given the tree number, your task is to find 
whether the given tree is a mango tree or not? Write a program to check whether the given number is a mango tree 
or not.

Input format:
Input consists of 3 integers
The first input denotes the number of rows
The second input denotes the number of columns
The third input denotes the tree number

Output format:
If the given number is a mango tree, print "Yes". Otherwise, print "No"
Refer the sample output for formatting
*/

public class Q1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

        int a=s.nextInt();

        int b=s.nextInt();

        int c=s.nextInt();

        if(c==10||c==11||c==16||c==17||c==18||c==19||c==20||c==5||c==4||c==2||c==3)

        {

            System.out.println("Yes");

        }

        else

        {

            System.out.println("No");

        }
	}
}
