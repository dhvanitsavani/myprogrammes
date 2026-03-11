#include<stdio.h>
#include<stdbool.h>

int main(){
    int n;
    bool isPrime=true;

    printf("Enter a number : ");
    scanf("%d", &n);

    for(int i = 2; i*i<n; i++){
        if(n % i == 0){
            isPrime = false;
            break;
        }
    }

    if(!isPrime){
        printf("not a prime number");
    }else{
        printf("is a prime number");
    }

    return 0;
}