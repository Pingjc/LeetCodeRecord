#include <stdio.h>
#include <malloc.h>
#include <String.h>

int lengthOfLongestSubstring(char * s){
	int i=0,j=0,maxLength=0;
	
	int *alphabeta=calloc(255,sizeof(int));
	
	while (s[j]!='\0') {
		int diff=s[j];
		
		if (alphabeta[diff]) {
            while (s[i]!=s[j]) {
            	alphabeta[(int)s[i]]=0;
                i++;
            }
            i++;
            j++;
            if (j-i > maxLength) {
                maxLength=j-i;
            }
        } else {
            alphabeta[diff]=1;
            j++;
            if (j-i > maxLength) {
                maxLength=j-i;
            }
        }
	}
	
	return maxLength;
}

int main() {
	char *str1="abcabcbb";
	char *str2="bbbbb";
	
	printf("%d",lengthOfLongestSubstring(str2));
}
