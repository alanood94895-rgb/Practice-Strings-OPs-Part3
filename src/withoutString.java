public class withoutString {
    public static void main(String[] args) {
        String base = "Hello there";
        String remove = "llo";

        for (int i = 0; i < base.length(); i++) {
            if (base.contains(remove)) {
                base = base.replace(remove, "");

            }
        }
        System.out.println(base);

    }
}
