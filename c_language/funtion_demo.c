#include<stdio.h>

void add(int a, int b){
    printf("sum = %d\n", a + b);
}

int add2(int a, int b){
    return a + b;
}

int main(){
    int a = 5, b = 7;

    add(a, b);

    int sum = add2(a, b);
    printf("sum = %d\n", sum);

    printf("sum = %d\n", add2(a, b));

    return 0;
}