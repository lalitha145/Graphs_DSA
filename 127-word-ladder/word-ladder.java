class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q=new LinkedList<>();
        HashSet<String> set=new HashSet<>(wordList);
        q.add(beginWord);
        int ans=1;
        while(!q.isEmpty()){
             int size=q.size();
              for(int k=0;k<size;k++){
                String temp=q.poll();
                if(temp.equals(endWord)) return ans;
                for(int j=0;j<temp.length();j++){
                        for(char i='a';i<='z';i++){
                         char a1[]=temp.toCharArray();
                         a1[j]=i;
                         String word1=new String(a1);
                         if(set.contains(word1)){
                            set.remove(word1);
                            q.add(word1);
                         }
                    }
            }
             }
            ans++;
        }
        return 0;
    }
}