public class Unicode {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 9398; i < 10178; i++) {
            if(count == 50) {
                System.out.println();
                count = 0;
            }
            System.out.print((char)i);
            count++;
        }
    }
}