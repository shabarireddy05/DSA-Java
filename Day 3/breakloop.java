public class breakloop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) {
            System.out.println("Washing dish number " + i);
            if (i == 3) {
                break; // Stop washing dishes after the 3rd one
            }
        }
        System.out.println("Done with the dishes (outside the loop).");
    }
}
