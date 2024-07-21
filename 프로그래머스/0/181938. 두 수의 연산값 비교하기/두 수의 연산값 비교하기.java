class Solution {
    public int solution(int a, int b) {
    int answer = 0;
    
    String atext = a + "";
    String btext = b + "";
    
    String abtext = atext + btext;
    int abnum = Integer.parseInt(abtext);
    
    int x = 2 * a * b;
    if(abnum > x)   answer = abnum;
        else    answer = x;
    
    if(abnum == x)  answer = abnum;
    
    return answer;
}
}