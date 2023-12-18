class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] Ss = s.toCharArray();
        Arrays.sort(Ss);
        
        char[] Tt = t.toCharArray();
        Arrays.sort(Tt);
        
        return Arrays.equals(Ss, Tt); 
    }
}