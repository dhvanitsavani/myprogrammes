#include<stdio.h>

int main(){
    char ch;

    //reading data :-
    FILE *fptr = fopen("demo_file_1.txt", "r");
    
    while((ch = fgetc(fptr)) != EOF){
        printf("%c", ch);
    }

    fclose(fptr);

    //writing data :-
    fptr = fopen("demo_file_2.txt", "w");

    fprintf(fptr, "this data is written by write mode in c programme.");

    fclose(fptr);

    //appending data :-
    fptr = fopen("demo_file_1.txt", "a");

    fprintf(fptr, "\nthis data is written by append mode in c programme.");

    fclose(fptr);

    return 0;
}