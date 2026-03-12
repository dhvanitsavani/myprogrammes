#include<stdio.h>

int main(){
    int arr[10], n, tar;

    printf("Enter size of array : ");
    scanf("%d", &n);

    for(int i=0; i<n; i++){
        printf("Enter %dth member of array : ", i);
        scanf("%d", &arr[i]);
    }

    printf("Enter target : ");
    scanf("%d", &tar);

    int s = 0, e = n-1, mid;

    while(s <= e){
        mid = (s + e)/2;

        if(arr[mid] == tar){
            printf("index = %d", mid);
            break;
        }else if(arr[mid] > tar){
            s = mid + 1;
        }else{
            e = mid - 1;
        }
    }

    return 0;
}