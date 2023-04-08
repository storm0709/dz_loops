public class Main {
    public static void main (String [] args) {
        int i = 6;
        while (i > 0 && i <= 6) {
            System.out.print (i + " ");

            int j = i;
            while(j > 0 && j <= 6) {
                System.out.print("#");
                j--;
            }

            i--;
            System.out.println ();
        }
    }
}