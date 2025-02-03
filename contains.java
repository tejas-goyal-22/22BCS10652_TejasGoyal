class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer , Integer> frequencyMap = new HashMap<>();

        for(int num : nums){

            frequencyMap.put(num , frequencyMap.getOrDefault(num ,0)+1);
        }

        for(int key : frequencyMap.keySet()){
            if(frequencyMap.get(key)>1){
                return true;
            }
           
        }
        return false;
        
    }
}