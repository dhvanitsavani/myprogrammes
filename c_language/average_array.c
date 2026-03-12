#include<stdio.h>

int main(){
    int arr[6] = {105, 20, 35, 10, 54, 9}, sum = 0, avg;

    for(int i=0; i<6; i++){
        sum += arr[i];
    }

    avg = sum / 6;
    printf("average of array = %d", avg);

    return 0;
}