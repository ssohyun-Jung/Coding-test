class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){  
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int max = Integer.MAX_VALUE; //최대 정수를 자동 할당
            
            for(int j = s; j <= e; j++){
                //k보다 크면서 && 최대 정수보다 작은 값
                if(arr[j] > k && arr[j] < max){
                    max = arr[j];
                }
            }
            if(max != Integer.MAX_VALUE){
                answer[i] = max;
            }else{
                answer[i] = -1;
            }
            
        }
        
        return answer;
    }
}