package studentWork.Chapter1.NestedMultiplication;  
    
    import java.util.Scanner;

    public class NestedMuliplication {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int size = console.nextInt();


        for (int row = 1; row <= size; row++) {
            for(int col = 1; col <= size; col++) {
                int product = row * col;
                System.out.print(product + "\t");

            }
        System.out.println();
        }
        console.close();
        
    }
}