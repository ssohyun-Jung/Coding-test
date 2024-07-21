class Solution {
    //ineq는 >, < 중 하나
    //eq는 =, ! 중 하나
    //n과 m이 ineq와 eq의 조건 맞으면 1 아니면 0 return
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(ineq.equals(">") && eq.equals("=")){
            answer = n >= m ? 1 : 0;
        }else if(ineq.equals("<") && eq.equals("=")){
            answer = n <= m ? 1 : 0;
        }else if(ineq.equals(">") && eq.equals("!")){
            answer = n > m ? 1 : 0;
        }else
            answer = n < m ? 1 : 0;
        return answer;
    }
}