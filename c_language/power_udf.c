#include<stdio.h>

int power(int n, int p){
    if(p == 0){
        return 1;
    }

    return n * power(n, p-1);
}

int main(){
    int n, p;

    printf("Enter number and power : ");
    scanf("%d %d", &n, &p);

    int ans = power(n, p);
    printf("answer = %d", ans);

    return 0;
}