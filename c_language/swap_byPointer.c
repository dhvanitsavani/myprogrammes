#include<stdio.h>

void main(){
    int a = 5, b = 10, temp;
    int *ptr_a = &a, *ptr_b = &b, *ptr_temp = &temp;

    ptr_temp = ptr_a;
    ptr_a = ptr_b;
    ptr_b = ptr_temp;

    printf("%d %d", *ptr_a, *ptr_b);
}