//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// Back-end complete function Template for C++

class Solution{
public:
    vector<vector<int>> transitiveClosure(int N, vector<vector<int>> graph)
    {
        // code here
        vector<vector<int>> output = graph;
        for(int i=0;i<N;i++)
        {
            vector<bool> vis(N, false);
            queue<int> q;
            for(int j=0;j<N;j++)
            {
                if(graph[i][j] == 1)
                {
                    vis[j] = true;
                    q.push(j);
                }
                else if( i == j)
                {
                    output[i][j] = 1;
                }
            }
            while(!q.empty())
            {
                int row = q.front();
                q.pop();
                output[i][row] = 1;
                for(int k=0;k<N;k++)
                {
                    if(graph[row][k] == 1 && !vis[k])
                    {
                        vis[k] = true;
                        q.push(k);
                    }
                }
            }
        }
        return output;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        vector<vector<int>> graph(N, vector<int>(N, -1));
        for(int i = 0;i < N;i++)
            for(int j=0;j<N;j++)
            cin>>graph[i][j];
        
        Solution ob;
        vector<vector<int>> ans = ob.transitiveClosure(N, graph);
        for(int i = 0;i < N;i++)
            {for(int j = 0;j < N;j++)
                cout<<ans[i][j]<<" ";
        cout<<"\n";}
    }
    return 0;
}
// } Driver Code Ends