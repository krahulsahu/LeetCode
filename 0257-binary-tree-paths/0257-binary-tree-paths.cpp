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
  
    vector<string> binaryTreePaths(TreeNode* root) {
    vector<string> result;
    string currentPath;

    
    findRootToLeafPaths(root, currentPath, result);

    return result;
}

    void findRootToLeafPaths(TreeNode* root, string currentPath, vector<string>& result) {
        if (root == nullptr) {
            return;
        }

        
        currentPath += to_string(root->val);

      
        if (root->left == nullptr && root->right == nullptr) {
            result.push_back(currentPath);
            return;
        }

        
        currentPath += "->";
        findRootToLeafPaths(root->left, currentPath, result);
        findRootToLeafPaths(root->right, currentPath, result);
    }
};