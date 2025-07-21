package recursion.array;

public class RecursionArrayDriver {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 4, 5};
        //System.out.println(IsSorted.isSorted(nums, 0));
        //System.out.println(LinearSearch.search(nums, 0, 5));
        //System.out.println(LinearSearch.searchAllOccurrence(nums, 0, 5, new ArrayList<>()));
        System.out.println(LinearSearch.searchAllOccurrence(nums, 0, 6));
    }
}
