#include<stdio.h>

void main(){
    char str[20], l=0;

    printf("Enter string : ");
    gets(str);

    for(int i=0; str[i] != '\0'; i++){
        l++;
    }

    printf("length of string = %d", l);
}