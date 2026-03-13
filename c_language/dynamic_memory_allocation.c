#include<stdio.h>

int main(){
    int* ptr = (int*)malloc(3 * sizeof(int));
    if(ptr == NULL) return 1;
    ptr[0] = 1;
    ptr[1] = 2;
    ptr[2] = 3;
    printf("malloc values : %d %d %d", ptr[0], ptr[1], ptr[2]);

    int* new_ptr = (int*)realloc(ptr, 5 * sizeof(int));
    if(new_ptr == NULL){
        free(ptr);
        return 1;
    }
    ptr = new_ptr;
    ptr[3] = 4;
    ptr[4] = 5;
    printf("\nrealloc values : %d %d %d %d %d", ptr[0], ptr[1], ptr[2], ptr[3], ptr[4]);
    
    int* zerod_ptr = (int*)calloc(3, sizeof(int));
    printf("\ncalloc values(should be zero) : %d %d %d", zerod_ptr[0], zerod_ptr[1], zerod_ptr[2]);

    free(ptr);
    free(zerod_ptr);

    return 0;
}