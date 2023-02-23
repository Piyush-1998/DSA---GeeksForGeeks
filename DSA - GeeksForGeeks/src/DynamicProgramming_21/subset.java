package DynamicProgramming_21;

import java.util.ArrayList;
import java.util.List;

public class subset {
	
	public static List<List<Integer>> subsetProblem(List<List<Integer>> subset, int[] nums, ArrayList<Integer> output, int index) {
		
		if(index==nums.length) {
			subset.add(output);
			return subset;
		}
		
		subsetProblem(subset,nums,new ArrayList<>(output),index+1);
		output.add(nums[index]);
		subsetProblem(subset,nums,new ArrayList<>(output),index+1);
		
		return subset;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		List<List<Integer>> subset = new ArrayList<>();
		System.out.println(subsetProblem(subset,nums,new ArrayList<>(),0));
	}

}
