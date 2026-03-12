#include<stdio.h>
#include<string.h>
#include<stdbool.h>

void main(){
    char str1[20], str2[20], ans_str[40];
    bool isSecondStarted = false;

    printf("Enter first string : ");
    gets(str1);

    printf("Enter second string : ");
    gets(str2);

    for(int i=0, j=0; i<strlen(str1)+strlen(str2); i++, j++){
        if(str1[j] == '\0'){
            j = 0;
            isSecondStarted = true;
        }
        if(!isSecondStarted){
            ans_str[i] = str1[j]; 
        }else{
            ans_str[i] = str2[j];
        }
    }

    ans_str[strlen(str1)+strlen(str2)] = '\0';

    puts(ans_str);
}