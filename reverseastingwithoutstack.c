#include <stdio.h>
#include <string.h>
#include <limits.h>
#include <stdlib.h>
void swap(char *a,char *b){
    char t=*a;*a=*b;*b=t;
}
void reverse(char str[]){
    int n =strlen(str);
    for(int i =0;i <n/2;i++){
        swap(&str[i],&str[n-i-1]);
    }
    
}
void main(){
    char str[]="abd";
    reverse(str);
    printf("the reverse of string is %s",str);
    return ;
}
