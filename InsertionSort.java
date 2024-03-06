import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int aux, iterator;
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Disordered values:");

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(
                input.nextLine()
            );
        }
        for(int i = 1; i < numbers.length; i++) {
            iterator = i;
            for (int j = iterator - 1; j >= 0; j--) {
                if(numbers[iterator] < numbers[j]) {
                    aux = numbers[iterator];
                    numbers[iterator] = numbers[j];
                    numbers[j] = aux;
                    iterator--;
                } else {
                    continue;
                }
            }
        }
        System.out.println("Ordered values:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        input.close();
    }
}
