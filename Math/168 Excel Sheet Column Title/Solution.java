class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder colTitle = new StringBuilder();
        
        while(columnNumber>0){
            columnNumber--;
            int remainder = (columnNumber)%26;
            char c = (char)('A'+remainder);
            colTitle.append(String.valueOf(c));
            columnNumber = columnNumber/26;
        }
        
        return colTitle.reverse().toString();
        
    }
}
