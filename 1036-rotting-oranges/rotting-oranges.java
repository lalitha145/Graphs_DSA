class Solution {
    public int orangesRotting(int[][] grid) {
        boolean hasFresh=false;
        int time=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1) hasFresh=true;
            if(grid[i][j]==2) {
                q.add(new int[]{i,j});
            }
            }
        }
        
        if(hasFresh==false) return 0;
        int dir[][]={{-1,0},{0,-1},{0,1},{1,0}};
       // System.out.println(q);
       System.out.println("Size"+q.size());
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int poll[]=q.poll();
                for(int d[]:dir){
                    int nr=d[0]+poll[0];
                    int nc=d[1]+poll[1];
                    if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                        System.out.println("I,J "+nr+"  "+nc);
                    }
                }
            }
            time++;
        }
        System.out.println(time);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++) if(grid[i][j]==1) return -1;
        }
        return time-1;
    }
}