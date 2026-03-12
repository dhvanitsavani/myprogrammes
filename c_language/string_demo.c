#include<stdio.h>

void main(){
    char str[10] = "Hello";
    char* str2 = " World";

    printf("%s", str);
    printf("%s", str2);

    char str3[20];
    printf("\nEnter string : ");
    scanf("%s", &str3);
    printf("%s", str3);
    getchar();
    //library function is needed for below :-
    char str4[20];
    printf("\nEnter string : ");
    gets(str4);
    puts(str4); 
}