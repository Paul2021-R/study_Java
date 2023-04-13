public class GuGu {
    public void dan(int n) {
        System.out.print(n);
        System.out.println(" 단 ");
        for (int i = 1; i < 10; i++) {
            System.out.print(n);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(n * i);
        }
    }
    public static void main (String[] args) {
        int n = 2;

        GuGu gugu = new GuGu();
        for(int i = 2; i < 10; i++) {
            gugu.dan(i);
        }
    }
}
