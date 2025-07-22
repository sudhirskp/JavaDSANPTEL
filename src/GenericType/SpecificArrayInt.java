package GenericType;

public class SpecificArrayInt {

    // Declaring an array of integer numbers
    int[] a;

    // Constructor to load the array
    SpecificArrayInt(int[] a) {
        this.a = a;
    }

    // Method to print the array elements
    void printInt() {
        for (int x : a)
            System.out.print(x + " ");
    }

    // Method to reverse the array elements
    void reverseInt() {
        int j = a.length - 1;
        for (int i = 0; i < j; i++) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        SpecificArrayInt array = new SpecificArrayInt(a);
        System.out.println("Before :");
        array.printInt();
        array.reverseInt();
        System.out.println();
        System.out.println("Reverse :");
        array.printInt();
    }
}

