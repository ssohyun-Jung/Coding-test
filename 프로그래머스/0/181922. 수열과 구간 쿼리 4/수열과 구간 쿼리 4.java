class Solution {
    public int[] solution(int[] arr, int[][] queries) {        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0]; //queries의 첫번째
            int e = queries[i][1]; //queries의 두번째
            int k = queries[i][2]; //queries의 세번째
            
            for(int j = s; j <= e; j++){ //j는 s의 값부터 e값까지 증가
                if(j % k == 0){ //s부터 e까지의 배열 중 j가 k의 배수이면
                    arr[j]++; //arr[j] 증가
                }
            }
        }        
        return arr;
    }
}