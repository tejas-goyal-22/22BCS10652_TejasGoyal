import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > nums.length / 2) {
                return key;
            }
        }

        throw new IllegalArgumentException("No majority element found"); // Shouldn't happen
    }
}