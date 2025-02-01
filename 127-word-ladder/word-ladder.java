class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q=new LinkedList<>();
        HashSet<String> set=new HashSet<>(wordList);
        q.add(beginWord);
        int steps=1;
        while(!q.isEmpty()){
            int size=q.size();
             for(int k=0;k<size;k++){
                String word=q.poll();
                if(word.equals(endWord)) return steps;
                if(word.equals(endWord)) return steps;
                    for(int j=0;j<word.length();j++){
                        for(char i='a';i<='z';i++){
                         char a1[]=word.toCharArray();
                         a1[j]=i;
                         String word1=new String(a1);
                         if(set.contains(word1)){
                            set.remove(word1);
                            q.add(word1);
                         }
                    }
                }
            }
            steps++;
        }
        return 0;
    }
}