class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=isConnected.length;
        int provinces=0;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(isConnected[i][j]==1 && i!=j){
                adj.get(i).add(j);
                adj.get(j).add(i);
               } 
            }
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                provinces++;
                dfs(vis,adj,i);
            }
        }
        return provinces;

    }
    void dfs(boolean vis[], List<List<Integer>> adj,int node){
        vis[node]=true;
        for(int nb:adj.get(node)){
            if(!vis[nb]){
                dfs(vis,adj,nb);
            }
        }
    }
}