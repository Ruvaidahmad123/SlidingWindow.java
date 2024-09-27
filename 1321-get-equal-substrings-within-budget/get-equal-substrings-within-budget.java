class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int i=0;
        int j=0;
        int count=0;
        int ans=0;
        while(j<n){
            if(s.charAt(j)!=t.charAt(j)){
                count=count+Math.abs(s.charAt(j)-t.charAt(j));
            }
            while(count>maxCost){
                count=count-Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}