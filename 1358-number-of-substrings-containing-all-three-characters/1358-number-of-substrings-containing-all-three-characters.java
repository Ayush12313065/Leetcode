class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        
       
        int[] last = new int[3];  
        Arrays.fill(last, -1);
        
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            last[ch - 'a'] = right;   
            
           
            if (last[0] != -1 && last[1] != -1 && last[2] != -1) {
             
                int minLast = Math.min(last[0], Math.min(last[1], last[2]));
                count += (minLast + 1);   
            }
        }
        
        return count;
    }
}