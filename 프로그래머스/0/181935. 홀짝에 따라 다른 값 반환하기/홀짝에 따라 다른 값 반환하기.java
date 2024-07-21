class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){ //n숫자만큼의 반복문
            if(n % 2 == 1){ //n이 홀수라면
                {if(i % 2 == 1) //n이하 i 모든 양의 홀수
                    answer += i; //n이하 홀수 합을 return
                }
            }else   //n이 짝수라면
                {if(i % 2 == 0) //n이하 i 모든 양의 짝수
                    answer += (i*i); //n이하 짝수의 제곱 합을 return
                }
        }
        return answer;
    }
}