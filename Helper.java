
public final class Helper {
    public static void clear_screen () {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static String fix_text(String s) {
        return s.strip().toLowerCase();
    }

}