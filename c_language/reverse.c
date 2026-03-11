#include<stdio.h>

int main(){
    int n, ans=0, rem;

    printf("Enter a number : ");
    scanf("%d", &n);

    while(n != 0){
        rem = n % 10;
        ans = (ans*10)+rem;

        n /= 10;
    }

    printf("Reversed number = %d", ans);
    return 0;
}