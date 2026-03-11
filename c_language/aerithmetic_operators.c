#include<stdio.h>

void main(){
    int a, b, sum, subs, prod, div, mod;

    printf("Enter two numbers : ");
    scanf("%d %d", &a, &b);

    sum = a + b;
    subs = a - b;
    prod = a * b;
    div = a / b;
    mod = a % b;

    printf("----------Result-----------");

    printf("\nsum = %d", sum);
    printf("\nsubstraction = %d", subs);
    printf("\nproduct = %d", prod);
    printf("\ndivision = %d", div);
    printf("\nmodule = %d", mod);
}