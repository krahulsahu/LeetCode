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
     vector<int> ans;
    vector<int> inOrder(TreeNode* root){
        if(!root) return {};
        inOrder(root->left);
        ans.push_back(root->val);
        inOrder(root->right);
        
        return ans;
    }
    
    int getMinimumDifference(TreeNode* root) {
        vector<int> arr = inOrder(root);
        int result = INT_MAX;
        sort(arr.begin(), arr.end());
        
         for(int i=0;i<arr.size()-1;i++){
            result = min(arr[i+1]-arr[i],result);
         }
        return result;
    }
};