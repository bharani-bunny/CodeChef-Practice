/*Problem
You're given an integer N. Write a program to calculate the sum of all the digits of N.

Input
The first line contains an integer T, the total number of testcases. Then follow T lines, each line contains an integer N.

Output
For each test case, calculate the sum of digits of N, and display it in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000
Example
Input
3 
12345
31203
2123
Output
15
9
8*/

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int sum = 0 ;
            while(a>0)
            {
                int temp = a%10;
                sum +=temp;
                a/=10;
            }
            System.out.println(sum);
        }
    }
}