//charAt() :String으로 저장된 문자열 중에서, 한글자만 선택해 Char로 변환 
class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        for(int i = 0; i < code.length(); i++){
            //code의 문자열 중 값이 1이면, mode는 1에서 mode를 빼줌.
            if(code.charAt(i) == '1')   mode = 1 - mode;
            //code의 문자열 중 값이 1이 아니면,
            //i를 mode로 비교하여 짝수일때만
            //answer에 code(i)를 추가해줌
            else if(i % 2 == mode) answer += code.charAt(i);
        }
        //빈 문자열이면 "EMPTY" 출력하고, 아니라면 answer 값 출력
        return "".equals(answer) ? "EMPTY" : answer;
    }
}