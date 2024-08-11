class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int i = 0; i < index_list.length; i++){
            //my_string문자열을 char 타입으로 변환
            //charAt(index_list[i])의 index_list[i]는 
            //my_string이 가리키고 있는 문자열에서
            //index_list[i]번째에 있는 문자를 char타입으로 변환
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }
}