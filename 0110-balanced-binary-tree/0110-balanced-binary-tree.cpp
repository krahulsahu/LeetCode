/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    
     int maxDepth(TreeNode* root) {
       
        if(root == NULL){
            return 0;
        }
        
        int LeftDepth = maxDepth(root->left);
        int rightDepth = maxDepth(root->right);
        
        return max(LeftDepth, rightDepth)+1; 
     }
    
    bool isBalanced(TreeNode* root) {
        if(root == NULL){
            return true;
        }
        int LH = maxDepth(root->left);
        int RH = maxDepth(root->right);
        
        return abs(LH-RH) <= 1 && isBalanced(root->left) && isBalanced(root->right);
    }
};
