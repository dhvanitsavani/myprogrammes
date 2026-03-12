#include<stdio.h>
#include<string.h>

void main(){
    char str[20];
    char temp;

    printf("Enter string : ");
    gets(str);

    for(int i=0; i<=strlen(str)/2; i++){
        temp = str[i];
        str[i] = str[strlen(str) - i - 1];
        str[strlen(str) - i - 1] = temp;
        
    }

    printf("%s", str);
}