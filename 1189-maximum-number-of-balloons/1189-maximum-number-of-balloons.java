class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(char ch :text.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) +1);
        }
        int ans = Integer.MAX_VALUE;
         ans = Math.min(map.getOrDefault('b',0),ans);
         ans = Math.min(map.getOrDefault('a',0),ans);
         ans = Math.min(map.getOrDefault('l',0)/2,ans);
         ans = Math.min(map.getOrDefault('o',0)/2,ans);
         ans = Math.min(map.getOrDefault('n',0),ans);
return ans;
    }
}