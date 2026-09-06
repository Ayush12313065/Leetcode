class Solution {
    public int numDistinct(String s, String t) {
        int[][] memo = new int[s.length()][t.length()];
        for(int [] row : memo){
            Arrays.fill(row,-1);
          
        }
          return backtrack(s,t,0,0,memo);
    }

    private int backtrack(String s,String t,int i,int j,int[][]memo){
        if (j == t.length()) return 1;         
        if (i == s.length()) return 0;

        if(memo[i][j] != -1) return memo[i][j];
       int ways =backtrack(s, t, i + 1, j, memo); 

        if (s.charAt(i) == t.charAt(j)) {
            ways += backtrack(s, t, i + 1, j + 1, memo);  
        }

        return memo[i][j] = ways;
    }
}