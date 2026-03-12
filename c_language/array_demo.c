#include<stdio.h>

int main(){
    int arr1[5] = {1, 2, 3, 4, 5};

    for(int i=0; i<5; i++){
        printf("%d ", arr1[i]);
    }
    printf("\n");

    int arr2[10], n;
    
    printf("Enter size of array : ");
    scanf("%d", &n);
    
    for(int i=0; i<n; i++){
        printf("enter %dth member of array : ", i);
        scanf("%d", &arr2[i]);
    }
    
    for(int i=0; i<n; i++){
        printf("%d ", arr2[i]);
    }

    return 0;
}