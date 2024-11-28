public class IllegalTriangleExcepltion {
    double side1;
    double side2;
    double side3;

    public static void main(String[] args){

    }
}
public class IllegalTriangleExcepltion {
    double side1;
    double side2;
    double side3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            int or = 0;
            for (int j = i; j < n; j++) {
                or |= arr[j];
                sum += or;
            }
        }

        System.out.println(sum);
    }
}