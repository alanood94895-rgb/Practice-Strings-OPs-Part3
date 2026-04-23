public class maxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla")); //2
        System.out.println(maxBlock("abbCCCddBBBxx")); //3
    }

    public static int maxBlock(String str) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                count = 1;
            } else {
                count++;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}

