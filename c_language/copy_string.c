#include<stdio.h>
#include<string.h>

void main(){
    char str[20], ans_str[20];

    printf("Enter string : ");
    gets(str);

    for(int i=0; str[i] != '\0'; i++){
        ans_str[i] = str[i];
    }

    ans_str[strlen(str)] = '\0';

    puts(ans_str);
}