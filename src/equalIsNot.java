public class equalIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));  // False
        System.out.println(equalIsNot("This is notnot"));// True
        System.out.println(equalIsNot("noisxxnotyynotxisi")); //True

    }

    public static boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - 2 && str.substring(i, i + 2).equals("is")) {
                isCount++;
            }
            if (i <= str.length() - 3 && str.substring(i, i + 3).equals("not")) {
                notCount++;
            }
        }
        return isCount == notCount;
    }
}