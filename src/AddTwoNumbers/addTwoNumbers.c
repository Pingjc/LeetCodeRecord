#include <stdio.h>
#include <malloc.h>
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 
 struct ListNode {
    int val;
    struct ListNode *next;
};


struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
	struct ListNode *ans=calloc(1,sizeof(struct ListNode));
	struct ListNode *tmp=ans;
	int upper=0;
	
	int calc=l1->val+l2->val+upper;
	ans->val=calc%10;
	upper=calc/10;
	l1=l1->next;
	l2=l2->next;
	
	while (l1 != 0 && l2 != 0) {
		tmp->next=calloc(1,sizeof(struct ListNode));
		tmp=tmp->next;
		int calc=l1->val+l2->val+upper;
		tmp->val=calc%10;
		upper=calc/10;
		l1=l1->next;
		l2=l2->next;
	}
	
	while (l1 != 0) {
		tmp->next=calloc(1,sizeof(struct ListNode));
		tmp=tmp->next;
		int calc=l1->val+upper;
		tmp->val=calc%10;
		upper=calc/10;
		l1=l1->next;
	}
	
	while (l2 != 0) {
		tmp->next=calloc(1,sizeof(struct ListNode));
		tmp=tmp->next;
		int calc=l2->val+upper;
		tmp->val=calc%10;
		upper=calc/10;
		l2=l2->next;
	}
	
	while (upper != 0) {
		tmp->next=calloc(1,sizeof(struct ListNode));
		tmp=tmp->next;
		int calc=upper;
		tmp->val=calc%10;
		upper=calc/10;
	}
	
	return ans;
}

struct ListNode* fillNode(int num) {
	struct ListNode *list=calloc(1,sizeof(struct ListNode));
	list->val=num%10;
	num/=10;
	struct ListNode *tmp=list;
	while (num>0) {
		tmp->next=calloc(1,sizeof(struct ListNode));
		tmp=tmp->next;
		tmp->val=num%10;
		num/=10;
	}
	
	return list;
}

void print(struct ListNode* list) {
	if (list==0) {
		printf("List is null\n");
		return;
	}
	struct ListNode *tmp=list;
	while (list->next != 0) {
		printf("%d->",list->val);
		list=list->next;
	}
	printf("%d\n", list->val);
}

int main() {
	struct ListNode *l1,*l2;
	l1=fillNode(342);
	l2=fillNode(465);
	
	struct ListNode *ans=addTwoNumbers(l1,l2);
	print(ans);
}
