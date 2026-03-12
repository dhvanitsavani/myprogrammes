#include<stdio.h>

int main(){
    int arr[10], n, tar, count=0;

    printf("Enter size of array : ");
    scanf("%d", &n);

    for(int i=0; i<n; i++){
        printf("Enter %dth member of array : ", i);
        scanf("%d", &arr[i]);
    }

    printf("Enter target : ");
    scanf("%d", &tar);

    for(int i=0; i<n; i++){
        if(arr[i] == tar){
            printf("index = %d", i);
        }else{
            count++;
        }
    }

    if(count == n){
        printf("target doesn't exist in array");
    }

    return 0;
}