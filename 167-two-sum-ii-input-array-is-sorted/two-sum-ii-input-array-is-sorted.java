class Solution {
    
    public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];
        
        solution(result, numbers, target);
        return result;
    }
    
    private static void solution(int[] result, int[] numbers, int target){
        
        int x = 0;
        int y = numbers.length-1;
       while(x < y){
           if(numbers[x] + numbers[y] == target){
                result[0] = x+1;
                result[1] = y+1;
            return;
            } else if(numbers[x] + numbers[y] > target){
                y--;
            } else {
                x++;
            }
       }
            
    }
}