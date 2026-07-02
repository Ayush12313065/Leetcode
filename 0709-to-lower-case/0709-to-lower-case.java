class Solution {
    public String toLowerCase(String s) {
        StringBuilder string  = new StringBuilder();
        for (char c :s.toCharArray()){
            if(Character.isUpperCase(c)){
                string.append(Character.toLowerCase(c));
            }
            else{
                string.append(c);
            }
        }
        return string.toString();
    }
}