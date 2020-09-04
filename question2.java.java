//question-2

import java.util.*;

public class Hello 

{

    public static void main(String args[])
 
    {

        Integer arr[]=new Integer[]{1,2,3,4,6,7,8};

        int min=Collections.min(Arrays.asList(arr));

        int max=Collections.max(Arrays.asList(arr));

        for(int i=min;i<=max;i++)

        {

            if(!Arrays.asList(arr).contains(i))

            {

                System.out.print(i);

            }

        }

    }

}