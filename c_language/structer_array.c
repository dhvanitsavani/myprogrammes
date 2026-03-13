#include<stdio.h>

struct employee{
    int id;
    char name[10];
    char dep[20];
    int salary;
};

void main(){
    struct employee e_array[] = {{1, "Dhruv", "computer", 18000}, {20, "Priya", "civil", 20000}, {15, "Aryan", "computer", 15000}};

    for(int i=0; i<3; i++){
        printf("\nEmployee's id : %d\n", e_array[i].id);
        printf("Employee's name : %s\n", e_array[i].name);
        printf("Employee's department : %s\n", e_array[i].dep);
        printf("Employee's salary : %d\n", e_array[i].salary);
    }

}