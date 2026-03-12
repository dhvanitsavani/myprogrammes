#include<stdio.h>

int main(){
    int arr[10], n;

    printf("Enter size of array : ");
    scanf("%d", &n);

    for(int i=0; i<n; i++){
        printf("Enter %dth member of array : ", i);
        scanf("%d", &arr[i]);
    }

    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[j] < arr[i]){
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
    }

    for(int i=0; i<n; i++){
        printf("%d ", arr[i]);
    }

    return 0;
}