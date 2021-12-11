#include <stdio.h>
#include <string.h>

void swap(char*a,char *b)
    {
    char t=*a;
    *a=*b;
    *b=t;
    }
void permute(char *a,int l ,int r)
	{
	 int i ;
	 if(l==r) printf("%s\n",a);
	   
	 else{
	       for(i=l;i<=r;i ++){
	            swap((a+l),(a+i));
	            permute(a,l+1,r);
	            swap((a+l),(a+i));
	       }
	       
	       }
	  
	}
	  
void main(){
    char s[100];
	      strcpy(s,"ABC");
	      permute(s,0,strlen(s));
}
