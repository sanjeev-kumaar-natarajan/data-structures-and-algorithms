package arrays;

import arrays.basic.ItemsMatchingRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDriver {

    public static void main(String[] args) {


        int[] nums = {3, 4, -1, 1};
        String str = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        int[][] logs = {{1993, 1999}, {2000, 2010}};
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        //System.out.println(Arrays.toString(FromPermutation.buildArrayFromPermutation(nums))); //1920
        //System.out.println(Arrays.toString(ConcatenationOfArray.getConcatenation(nums))); //1929
        /*SortColors.sortColors(nums);
        System.out.println(Arrays.toString(nums));*/ //75
        //System.out.println(Arrays.toString(ProductExceptSelf.productExceptSelf(nums))); //238
        //System.out.println(FirstMissingPositive.firstMissingPositive(nums));
        //System.out.println(EvenDigits.findNumbers(nums)); //1295
        //System.out.println(CheckPangram.checkIfPangram(str));
        //System.out.println(AppleRedistribution.minimumBoxes(new int[]{1, 3, 2}, new int[]{4, 3, 1, 5, 2}));//217
        //System.out.println(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1})); //217
        //System.out.println(MaxPopulationYear.maximumPopulation(logs)); //1854
        System.out.println(ItemsMatchingRule.countMatches(items, "color", "silver"));

    }

}
