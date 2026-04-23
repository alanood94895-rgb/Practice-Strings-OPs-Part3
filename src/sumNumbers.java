public class sumNumbers {
public static void main (String[] args){
    System.out.println(sumNumbers("abc123xyz"));
    System.out.println(sumNumbers);
}
    public static int sumNumbers(String str) {
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i); // build number
            } else {
                if (!num.equals("")) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        if (!num.equals("")) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}
