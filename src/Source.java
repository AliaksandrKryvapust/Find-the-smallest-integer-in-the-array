import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int [] arr = new int[]{78,56,232,12,11,43};
        System.out.println(findSmallestInt(arr)==11);
    }
    public static int findSmallestInt(int[] args) {
    return Arrays.stream(args).min().getAsInt();
    }
}
