//String으로 변환 후 equals사용하여 문자열 비교
class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        String x = String.valueOf(flag); //boolean을 string으로 변환
        
        if(x.equals("true")) answer = (a+b);
        else    answer = (a-b);
        return answer;
    }
}