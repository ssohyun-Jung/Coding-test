class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        int sumsum = (a*a) + (b*b) + (c*c);
        int sumsumsum = (a*a*a) + (b*b*b) + (c*c*c);
        //3개의 주사위를 굴렸을때 나온 숫자가 a,b,c
        //a,b,c가 모두 다르다면, a+b+c
        //두개만 같다면, (a+b+c) * (a 제곱 + b 제곱 + c 제곱)
        //모두 같다면, (a+b+c) * (a 제곱 + b 제곱 + c 제곱) * (a 세제곱 + b 세제곱 + c 세제곱)
        
        if(a != b && b != c && a != c) answer = sum;
        else if(a == b || b == c || a == c) answer = sum * sumsum;
        
        if(a == b && b == c && a == c) answer = sum * sumsum * sumsumsum;
        
        return answer;
    }
}