public class sameEnds {
    public static void main(String[] args) {
        System.out.println("abXYab"); //"ab"
        System.out.println("xx"); //"x"
    }

    public static String sameEnds(String str) {
        for (int i = str.length() / 2; i > 0; i--) {
            if (str.substring(0, i).equals(str.substring(str.length() - i))) {
                return str.substring(0, i);
            }
        }
        return "";
    }
}