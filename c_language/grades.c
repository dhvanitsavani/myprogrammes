#include<stdio.h>

void main(){
    int marks;
    char grade;

    printf("Enter marks : ");
    scanf("%d", &marks);

    if(marks >= 90){
        grade = 'a';
    }else if(marks >= 80){
        grade = 'b';
    }else if(marks >= 70){
        grade = 'c';
    }else if(marks >= 60){
        grade = 'd';
    }else if(marks >= 35){
        grade = 'e';
    }else{
        grade = 'f';
    }

    printf("Grade : %c", grade);
}