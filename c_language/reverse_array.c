#include<stdio.h>

int main(){
    int arr[6] = {1, 5, 3, 10, 7, 8}, temp;

    for(int i=0; i<6/2; i++){
        temp = arr[i];
        arr[i] = arr[6-i-1];
        arr[6-i-1] = temp;
    }

    for(int i=0; i<6; i++){
        printf("%d ", arr[i]);
    }
    
    return 0;
}