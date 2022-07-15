class Solution {
    public int titleToNumber(String columnTitle) {
        
        double result=0;
        int pow=0;
        for(int i=columnTitle.length()-1; i>=0; i--){
            
            double a = columnTitle.charAt(i)-'A'+1;
            double power=Math.pow(26, pow);
            a=a*power;
            result+=a;
            pow++;
            
        }
        return (int)result;
    }
}
