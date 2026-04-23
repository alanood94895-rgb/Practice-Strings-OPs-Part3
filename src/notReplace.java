public class notReplace {
public static void main(String[] args){
    System.out.println(notReplace);
    System.out.println(notReplace);
}
    public static String notReplace(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {

                boolean before = (i == 0 || !Character.isLetter(str.charAt(i - 1)));
                boolean after = (i + 2 >= str.length() || !Character.isLetter(str.charAt(i + 2)));

                if (before && after) {
                    result += "is not";
                    i++;
                    continue;
                }
            }

            result += str.charAt(i);
        }

        return result;
    }
}
