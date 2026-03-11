#include<stdio.h>

void main(){
    int a, b, c;

    printf("Enter two numbers : ");
    scanf("%d %d", &a, &b);

    //using third variable :-
    c = a;
    a = b;
    b = c;

    printf("Swapped using third variable : %d %d", a, b);

    //without third variable :-
    a = a + b;
    b = a - b;
    a = a - b;

    printf("\nAgain swapped without third variable : %d %d", a, b);
}