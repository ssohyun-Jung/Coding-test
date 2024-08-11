class Solution {
    public int solution(String number) {
        int answer = 0;
        //문자열 number의 각 자리 숫자 합을 9로 나눈 나머지 return

        //확장 for문 사용
        //모든 요소의 값들을 루프로 가져와서 처리
        //변수명 c : 반복대상 numberArray(문자열을 문자배열로 반환)
        for(char c : number.toCharArray()){
            //문자를 숫자로 변환 : char - '0' 해주면 숫자로 반환되어 값을 저장 가능함.
            answer += c - '0';
        }        
        return answer % 9;
    }
}