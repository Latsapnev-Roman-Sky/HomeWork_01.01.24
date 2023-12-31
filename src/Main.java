public class Main {
    public static void main(String[] args) {

        //Task 1

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        int[] array3 = new int[3];
        array3[0] = 99;
        array3[1] = 999;
        array3[2] = 9999;

        //Task 2

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println();

        //Task 3

        for (int i = array.length - 1; i >=0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println();

        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println();

    }
}