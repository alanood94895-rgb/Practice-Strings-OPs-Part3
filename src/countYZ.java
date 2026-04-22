public class countYZ {
    public static void main(String[] args) {
        System.out.println(countYZ ("fez day"));
    }
    public static Integer countYZ (String str){
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'y' || c == 'z') {
                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                }
            }
        }


}
