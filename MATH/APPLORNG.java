/*Problem
Bob has XX rupees and goes to a market. The cost of apples is Rs. AA per kg and the cost of oranges is Rs. BB per kg.

Determine whether he can buy at least 11 kg each of apples and oranges.

Input Format
The first line of input will contain an integer XX, the amount of money Bob has.
The second line of input contains two space-separated integers AA and BB, the cost per kg of apples and oranges respectively.
Output Format
Print a single line containing Yes if Bob can buy the fruits and No otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings yes, Yes, yEs, and YES will all be treated as identical).

Constraints
1 \leq X,A,B \leq 10^51≤X,A,B≤10 
5
 
Subtasks
Subtask 1 (100 points):
Original constraints.
Sample 1:
Input
14 
Output
2 2
Yes
Explanation:
The cost of buying 11 kg each of apple and orange is 2+2 = 42+2=4. Since Bob has more than 44 rupees, the answer will be Yes.

Sample 2:
Input
1 
Output
1 1
No
Explanation:
Bob can only buy either 11 kg of apples or 11 kg of oranges with 11 rupee, hence the answer is No.

Sample 3:
Input
5
Output
3 2
Yes
Explanation:
The cost of buying 11 kg each of apple and orange is 3+2 = 53+2=5. Since Bob has exactly 55 rupees, the answer will be Yes.

Sample 4:
Input
10000
Output
5000 6000
No
Explanation:
The cost of buying 11 kg each of apple and orange is 5000+6000 = 110005000+6000=11000. Since Bob has only 1000010000 rupees, the answer will be No.*/

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
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(b+c <= a)
		    System.out.println("YES");
	    else
	        System.out.println("NO");
	}
}
