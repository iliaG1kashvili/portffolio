public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,4,3,2,9,6,7};
        int target = 5;
                int n = nums.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (nums[i] + nums[j] == target) {
                            System.out.println(new int[]{i, j});
                        }
                    }
                }
        System.out.println(new int[]{});
    }
}