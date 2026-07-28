class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb=new StringBuilder();
        String s=num+"";
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6' && flag){
                sb.append('9');
                flag=false;
            }else{
                sb.append(s.charAt(i));
            }
        }
        int ans=Integer.parseInt(String.valueOf(sb));
        return ans;
    }
}
