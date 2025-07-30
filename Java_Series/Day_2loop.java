public class Day_2loop {

    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            // System.out.print("i"+i + " ");
            for(int j = 0; j<= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println(); 
        }
        System.out.println("reverse"); 
        for(int l = 4; l>0; l--){
            for(int m = 0; m< l; m++){
                System.out.print("*" + " ");
            }
            System.out.println( );
        }
    //for(int i = 1; i <= n; i++) 
    // 1. Print (n - i) spaces
    // 2. Print i stars
    // 3. New line

        // public class Pattern3 {
        int n = 5; // total number of rows

        for(int i = 1; i <= n; i++) {
            
            // STEP 1: Print spaces (n - i times)
            for(int space = 1; space <= n - i; space++) {
                System.out.print("  "); // 2 spaces to match "* "
            }

            // STEP 2: Print stars (i times)
            for(int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            // STEP 3: Move to the next line
            System.out.println();
        }
    


    }
}

