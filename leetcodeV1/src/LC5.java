public class LC5 {
    public String longestPalindrome(String s) {
         if(s.length() < 2){
            return s;
         }
         //初始化dp库
         boolean[][] dp = new boolean[s.length()][s.length()];
         //对角线一定为回文数
         for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
         }
         //初始化坐标系
         int maxLen = 1;
         int start = 0;
         
         char[] c = s.toCharArray();

         for(int j = 1;j < s.length(); j++){
            for(int i = 0; i < j;i ++){
                if(c[i] != c[j]){
                    dp[i][j] = false;
                }else{
                    if(j - i < 3){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
            if(dp[i][j] == true && j - i + 1 > maxLen){
                maxLen = j - i + 1;
                start = i;
            }
            }
         }


         return s.substring(start, maxLen + start);
    }
}
