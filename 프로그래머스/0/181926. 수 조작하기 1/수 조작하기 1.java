class Solution {
    public int solution(int n, String control) {
        //control은 w=+1, a=-10, s=-1, d=+10
        //앞에서부터 문자에 따라 n의 값을 바꿈
        //n을 바꿨을때, 가장 마지막에 나오는 n의 값을 return
        
        //charAt는 특정 위치의 문자를 단일값으로 반환
        for(int i = 0; i < control.length(); i++){
            switch(control.charAt(i)){
                case    'w':
                    n += 1;
                    break;
                case    'a':
                    n -= 10;
                    break;
                case    's':
                    n -= 1;
                    break;
                case    'd':
                    n += 10;
                    break; 
            }
        }
        return n;
    }
}