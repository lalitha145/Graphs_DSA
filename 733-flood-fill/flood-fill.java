class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        int startColor=image[sr][sc];
        image[sr][sc]=color;
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        boolean vis[][]=new boolean[image.length][image[0].length];
        vis[sr][sc]=true;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int poll[]=q.poll();
                for(int d[]:dir){
                  int nr=d[0]+poll[0];
                  int nc=d[1]+poll[1];
                  if(nr>=0 && nc>=0 && nr<image.length && nc<image[0].length && !vis[nr][nc] && image[nr][nc]==startColor){
                    vis[nr][nc]=true;
                    q.add(new int[]{nr,nc});
                    image[nr][nc]=color;
                  }
             } 
          }
     }
     return image;
}
}