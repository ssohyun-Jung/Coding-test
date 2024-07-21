class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        //두 정수 a, b와 길이가 n인 배열 included(included.length가 주어짐.
        for(int i = 0; i < included.length; i++){
                //true인 항들만 더한 값을 return
            if(included[i] == true){
                //첫째항이 a, 공차가 d 인 등차수열(a + (i * d)에서        
                answer += a + (i * d);
            }
        }
        return answer;
    }
}