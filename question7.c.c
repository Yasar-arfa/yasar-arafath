//question-7

#include<stdio.h>

#include<math.h>

int AddDigits(int n)

{

    int k,sum=0,c;

    while(n!=0)

    {

        sum+=n%10;

        n/=10;

        c++;

    }

    if(c==1)

        return sum;

    else

        AddDigits(sum);

}



int main()

{

    int number;

    scanf("%d",&number);

    printf("%d",AddDigits(number));

}