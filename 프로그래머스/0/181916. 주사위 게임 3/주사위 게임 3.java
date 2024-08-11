import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] min = {a, b, c, d};
        Arrays.sort(min);
        int answer = 0;
        
        //1. 모두 같다면 1111 * p
        if(a == b && c == d && a == d && a == c){
            answer = 1111 * a;
        }
        //2. 3개의 숫자만 같다면 10 * p + q
        else if(a == c && c == d){ //acd
            answer = (10 * c + b)*(10 * c + b);
        }else if(b == c && c == d){ //bcd
            answer = (10 * c + a)*(10 * c + a);       
        }else if(a == b && b == d){ //abd
            answer = (10 * b + c)*(10 * b + c);
        }else if(a == b && b == c){ //abc
            answer = (10 * b + d)*(10 * b + d);
        }
        
        //3. 짝 2개씩의 숫자가 같다면 (p + q) * |p - q|
        else if((a == b && c == d) || (a == d && b == c)){ //ab, cd / ad, bc
            answer = (a + c) * Math.abs(a - c);
        }else if((b == c && a == d) || (b == d && a == c)){ //bc, ad / ac, bd
            answer = (b + a) * Math.abs(b - a);
        }
        
        //4. 2개의 숫자가 같다면 다른 값(p * q)
        else if(a == b){
            answer = c * d;
        }else if(a == c){
            answer = b * d;
        }else if(a == d){
            answer = b * c;
        }
        else if(b == c){
            answer = a * d;
        }else if(b == d){
            answer = a * c;
        }
        else if(c == d){
            answer = a * b;
        }
        //5. 모두 다르면 가장 작은값
        else if(a != b && b != c && c != d && d != a){
            answer = min[0];
        }
        return answer;
    }
}