#include<stdio.h>

int main(){
    int n;
    int a = 0, b = 1, next;

    printf("Enter n : ");
    scanf("%d", &n);

    for(int i = 1; i <= n; i++){
        printf("%d ", a);
        
        next = a + b;
        a = b;
        b = next;
    }

    return 0;
}