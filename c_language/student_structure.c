#include<stdio.h>

struct student{
    int roll_no;
    char name[10];
    int age;
    float marks;
};

void print_data(struct student s){
    printf("\nstudent's name : %s\n", s.name);
    printf("student's roll number : %d\n", s.roll_no);
    printf("student's age : %d\n", s.age);
    printf("student's marks : %.2f\n", s.marks);
}

int main(){
    struct student s1 = {10, "Priya", 15, 91.21};
    struct student s2;

    print_data(s1);

    printf("\nEnter student's roll number : ");
    scanf("%d", &s2.roll_no);
    printf("Enter student's name : ");
    scanf("%s", &s2.name);
    printf("Enter student's age : ");
    scanf("%d", &s2.age);
    printf("Enter student's marks : ");
    scanf("%f", &s2.marks);

    print_data(s2);

    return 0;
}