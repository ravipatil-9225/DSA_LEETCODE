class Solution {
    public boolean numberHasBooleanDigits (int num){
        int digitscount = 0;
        while (num !=0){
            num = num/10;
            digitscount++;
        }
        return digitscount % 2 ==0;
    }
    public int findNumbers(int[] nums) {   
        int evenCount = 0;

        for(int i=0;i<nums.length;i++){
            if(numberHasBooleanDigits(nums[i])){
                evenCount++;
            }
        }

        return evenCount;
    }
}