/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{

         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         sc.nextLine();
         int a[][]=new int[n][2];
         int c[][]=new int[n][];
         for(int i=0;i<n;i++)
         {
             String s[]=sc.nextLine().split(" ");
             for(int j=0;j<s.length;j++)
             {
                 a[i][j]=Integer.parseInt(s[j]);
             }
             //customers money matrix
             c[i]=new int[a[i][0]];
             String s1[]=sc.nextLine().split(" ");
             for(int k=0;k<s1.length;k++)
             {
              c[i][k]=Integer.parseInt(s1[k]);
             }
             
             
         }
         for(int i=0;i<n;i++)
         {
             int m=a[i][1];
             for(int j=0;j<a[i][0];j++)
             {
                if(c[i][j]<=m)
                {
                    System.out.print("1");
                    m=m-c[i][j];
                }
                else 
                {
                    System.out.print("0");
                }
             }
             System.out.println();
         }
         







	}
}
