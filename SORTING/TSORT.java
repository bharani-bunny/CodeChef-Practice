/*Problem
Given the list of numbers, you are to sort them in non decreasing order.
Input
t – the number of numbers in list, then t lines follow [t <= 10^6].
Each line contains one integer: N [0 <= N <= 10^6]

Output
Output given numbers in non decreasing order.
Example
Input:
5
5
3
6
7
1
Output:
1
3
5
6
7*/

import java.util.*;
class chef
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<t;i++)
            System.out.println(a[i]);
    }
}