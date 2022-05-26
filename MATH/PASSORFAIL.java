/*Problem
Chef is struggling to pass a certain college course.

The test has a total of NN question, each question carries 33 marks for a correct answer and -1−1 for an incorrect answer. Chef is a risk-averse person so he decided to attempt all the questions. It is known that Chef got XX questions correct and the rest of them incorrect. For Chef to pass the course he must score at least PP marks.

Will Chef be able to pass the exam or not?

Input Format
First line will contain TT, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, three integers N, X, PN,X,P.
Output Format
For each test case output "PASS" if Chef passes the exam and "FAIL" if Chef fails the exam.

You may print each character of the string in uppercase or lowercase (for example, the strings "pAas", "pass", "Pass" and "PASS" will all be treated as identical).

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq N \leq 1001≤N≤100
0 \leq X \leq N0≤X≤N
0 \leq P \leq 3\cdot N0≤P≤3⋅N
Sample 1:
Input
3
5 2 3
5 2 4
4 0 0
Output
PASS
FAIL
FAIL
Explanation:
Test case 11: Chef gets 22 questions correct giving him 66 marks and since he got 33 questions incorrect so he faces a penalty of -3−3. So Chef's final score is 33 and the passing marks are also 33, so he passes the exam :)

Test case 22: Chef's total marks are 33 and since the passing marks are 44, Chef fails the test :(

Test case 33: Chef got all the problems wrong and thus his total score is -4−4. Since the passing marks are 00, Chef fails the exam :(*/

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
		    int n = sc.nextInt();
		    int c = sc.nextInt();
            	    int p = sc.nextInt();
            	    int x = (c*3)-(n-c);
            	    if(x >= p)
                	System.out.println("PASS");
            	    else
                	System.out.println("FAIL");
		}
	}
}
