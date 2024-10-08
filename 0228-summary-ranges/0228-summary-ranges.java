class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0, end = 0;
        List<String> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
          while(i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
            end++;
            i++;
          }
          if(start == end) {
            list.add(String.valueOf(nums[start]));
          } else {
            list.add(nums[start] + "->" + nums[end]);
          }
          end++;
          start = end;
        }
    return list;
    }
}