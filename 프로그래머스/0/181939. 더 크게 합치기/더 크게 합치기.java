class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String atext = a + "";
        String btext = b + "";
        
        String absub = atext + btext;
        String basub = btext + atext;
        
        int abnum = Integer.parseInt(absub);
        int banum = Integer.parseInt(basub);
        
        if(abnum > banum){
            answer = abnum;
        }else{
            answer = banum;
        }
        
        if(abnum == banum){
            answer = abnum;
        }
        return answer;
    }
}