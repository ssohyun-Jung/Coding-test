class Solution {
    public int solution(int[] num_list) {
        int answer = 0;      
        //int를 String으로 변환할 문자열 지정
        String str1 = ""; //홀수
        String str2 = ""; //짝수

        for(int i = 0; i < num_list.length; i++){           
            if(num_list[i] % 2 == 1)
                //int를 string으로 저장 (toString이용)
                str1 += Integer.toString(num_list[i]);
            else
                str2 += Integer.toString(num_list[i]);
        }
        //string을 int로 변환(parseInt이용)한 값 answer에 저장
        answer = Integer.parseInt(str1) + Integer.parseInt(str2);
        return answer;
    }
}