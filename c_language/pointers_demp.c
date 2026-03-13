#include<stdio.h>

void main(){
    int a = 10;
    int* ptr = &a;
    printf("address of a : %p", ptr);
    printf("\nvalue at address : %d", *ptr);
}