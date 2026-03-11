#include<stdio.h>

void main(){
    int r;
    float py=3.14, area;

    printf("Enter radius : ");
    scanf("%d", &r);

    area = py * r * r;

    printf("Area of circle = %.3f", area);
}