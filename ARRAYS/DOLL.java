/*Problem
“You won’t get caught if you hide behind someone.”

Sang-Woo advises Gi-Hun to hide behind someone to avoid getting shot.

Gi-Hun follows Sang-Woo's advice and hides behind Ali, who saved his life earlier. Gi-Hun and Ali both have the same height, KK. Many players saw this trick and also started hiding behind Ali.

Now, there are NN players standing between Gi-Hun and Ali in a straight line, with the i^{\text{th}}i 
th
  player having height H_iH 
i
​
 . Gi-Hun wants to know the minimum number of players who need to get shot so that Ali is visible in his line of sight.

Note:

Line of sight is a straight line drawn between the topmost point of two objects. Ali is visible to Gi-Hun if nobody between them crosses this line.
Even if there are some players who have the same height as that of Gi-Hun and Ali, Ali will be visible in Gi-Hun's line of sight.
Gi-Hun and Ali have the same height.
Input Format
The first line of input contains a single integer TT, denoting the number of test cases. The description of TT test cases follows.
The first line of each test case contains two space-separated integers NN and KK, denoting the total number of players between Gi-Hun and Ali and the height of both of them respectively.
The second line of each test case contains NN space-separated integers, denoting the heights of the players between Gi-Hun and Ali.
Output Format
For each test case, output in a single line the minimum number of players who need to get shot so that Ali is visible in Gi-Hun's line of sight.

Constraints
1 \leq T \leq 10^51≤T≤10 
5
 
1 \leq N \leq 10^51≤N≤10 
5
 
1 \leq K \leq 10^61≤K≤10 
6
 
1 \leq H_i \leq 10^61≤H 
i
​
 ≤10 
6
  for every 1 \leq i \leq N1≤i≤N.
The sum of NN across all test cases does not exceed 5\cdot 10^55⋅10 
5
 .
Sample 1:
Input
Output
3
4 10
2 13 4 16
5 8
9 3 8 8 4
4 6
1 2 3 4
2
1
0
Explanation:
Test Case 1: Gi-Hun and Ali have height 1010. For Ali to be visible to Gi-Hun, the second person (with height 1313) and the fourth person (with height 1616) need to get shot. Hence, the minimum number of players who need to get shot is 22.

Test Case 2: Gi-Hun and Ali have height 88. For Ali to be visible to Gi-Hun, the first person (with height 99) needs to get shot. Hence, the minimum number of players who need to get shot is 11.

Test Case 3: Nobody needs to get shot because everyone is shorter than Gi-Hun and Ali.*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0)
		{
		    int np = sc.nextInt();
		    int h = sc.nextInt();
		    int a[] = new int[np];
		    int count = 0;
		    for(int i=0;i<np;i++)
		    {
		        a[i] = sc.nextInt();
		        if(a[i] > h)
		            count++;
		    }
		    System.out.println(count);
		}
	}
}

