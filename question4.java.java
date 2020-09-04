//question-4

import java.util.*;

public class Hello 

{

    static int CountOnes(int startrange,int endrange)

    {

        int count=0;

        for(int index=startrange;index<=endrange;index++)

            {

                String s=Integer.toString(index);

                for(int j=0;j<s.length();j++)

                {

                    if(s.charAt(j)=='1')

                        count++;

                }

            }

            return count;

    }

    public static void main(String args[]) 
 
   {

        Scanner sc=new Scanner(System.in);

        int start=sc.nextInt();

        int end=sc.nextInt();

        System.out.print(CountOnes(start,end));

     }

}