/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int getDecimalValue(ListNode* head) {
        string s;
        int r=0,p=1;
        while(head!=NULL){
            s=s+(char)head->val;
            head=head->next;
        }
        for(int i=s.length()-1;i>=0;i--){
            r=r+(p*(int)s[i]);
            p*=2;
        }
        return r;
    }
};
