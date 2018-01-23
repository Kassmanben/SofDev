import java.util.function.IntFunction;

public class Map {
    public void map(IntFunction<Integer> f, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(f.apply(nums[i]));
        }
    }

    public static void main(String[] args) {
        new Map().run();
    }

    public void run() {
        int[] nums = {1, 2, 3, 4};
        Map m = new Map();
        map((n) -> n * n, nums); //Lambda function in Java
        map((n) -> n * n * n, nums);

    }


}




