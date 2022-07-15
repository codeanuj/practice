class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder colTitle = new StringBuilder();
        
        while(columnNumber>0){
            /* doing -1 from colNumber as A==1 and then Z==26 in excel but in number system A==0 and Z==25 */
            columnNumber--;
            int remainder = (columnNumber)%26;
            char c = (char)('A'+remainder);
            colTitle.append(String.valueOf(c));
            columnNumber = columnNumber/26;
        }
        
        return colTitle.reverse().toString();
        
    }
}
