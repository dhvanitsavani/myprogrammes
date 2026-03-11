#include<stdio.h>

void main(){
    int a, b, c, ans;

    printf("Enter three numbers : ");
    scanf("%d %d %d", &a, &b, &c);

    if(a > b){
        if(a > c){
            ans = a;
        }else{
            ans = c;
        }
    }else{
        if(b > c){
            ans = b;
        }else{
            ans = c;
        }
    }

    printf("Largest number = %d", ans);
}