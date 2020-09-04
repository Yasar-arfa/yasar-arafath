//question-3

#include<stdio.h>


int main()
{

    printf("Enter x and y");

    int x,y;

    scanf("%d\n%d",&x,&y);

    printf("\nBefore swapping\nx=%d\ny=%d",x,y);

    x = x ^ y;

    y = x ^ y;
 
   x = x ^ y;

    printf("After swapping\nx=%d\ny=%d",x,y);



}