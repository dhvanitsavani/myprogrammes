#include<stdio.h>
#include<limits.h>

int main(){
    int arr[6] = {23, 10, 15, 100, 90, 65}, largest = INT_MIN;

    for(int i=0; i<6; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
    }

    printf("largest element in array = %d", largest);

    return 0;
}