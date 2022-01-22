public class Unicode {
    public static void main(String[] args) {
        char cha;
        int count = 0;
        for (int i = 9398; i < 10178; i++) {
            cha = (char)i;
            if(count == 50) {
                System.out.println();
                count = 0;
            }
            System.out.print(cha);
            count++;
        }
    }
}