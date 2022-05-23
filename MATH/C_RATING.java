/*Problem
Alice has recently started playing Chess. Her current rating is XX. She noticed that when she wins a game, her rating increases by 88 points.

Can you help Alice in finding out the minimum number of games she needs to win in order to make her rating greater than or equal to YY?

Input Format
The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
The first line of each test case contains two integers XX and YY, as described in the problem statement.
Output Format
For each test case, output the minimum number of games that Alice needs to win in order to make her rating greater than or equal to YY.

Constraints
1 \leq T \leq 10^41≤T≤10 
4
 
1 \leq X \leq Y \leq 10^41≤X≤Y≤10 
4
 
Sample 1:
Input
4
10 10
10 17
10 18
10 19
Output
0
1
1
2
Explanation:
Test case 11: Since Alice's current rating XX is already equal to her desired rating YY, she doesn't need to win any game.

Test case 22: Alice's current rating is 1010. After winning 11 game, her rating will become 10+8=1810+8=18, which is greater than her desired rating of 1717. Thus, she has to win at least 11 game.

Test case 33: Alice's current rating is 1010. After winning 11 game, her rating will become 10+8=1810+8=18, which is equal to her desired rating of 1818. Thus, she has to win at least 11 game.

Test case 44: Alice's current rating is 1010. After winning 11 game, her rating will become 1818, which is less than her desired rating of 1919. She will need to win one more game in order to make her rating 2626, which is greater than 1919. Thus, she has to win at least 22 games.*/

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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int ans = 0;
		    while(a<b) 
		    {
		        a += 8;
		        ans++;
		    }
	        System.out.println(ans);
		}
	}
}
