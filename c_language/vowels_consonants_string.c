#include<stdio.h>
#include<ctype.h>

void main(){
    char str[20];
    int vowels=0, cons=0;

    printf("Enter string : ");
    gets(str);

    for(int i=0; str[i] != '\0'; i++){
        char ch = tolower(str[i]);

        if(ch >= 97 && ch <= 122){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else{
                cons++;
            }
        }
    }

    printf("vowels = %d\nconsonants = %d", vowels, cons);
}