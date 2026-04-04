import java.util.*;

public class Solution{

	public int[] twoSum(int[]nums, int target){
		if(nums == null || nums.length < 2) return new int[]{};
		int n = nums.length;

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < n ; i++){
			int res = target - nums[i];|
			if(map.containsKey(res)) {
				return new int[]{map.get(res), i};
			}
			else{
				map.put(nums[i], i);
			}
		}
		return new int[]{};
	}
}
