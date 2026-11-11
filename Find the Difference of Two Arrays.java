class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int n1 : nums1) {
            boolean found = false;
            for (int n2 : nums2) if (n1 == n2) found = true;
            if (!found && !list1.contains(n1)) list1.add(n1);
        }
        for (int n2 : nums2) {
            boolean found = false;
            for (int n1 : nums1) if (n2 == n1) found = true;
            if (!found && !list2.contains(n2)) list2.add(n2);
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(list1);
        res.add(list2);
        return res;
    }
}
