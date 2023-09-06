public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println("The 10th term of the fibonacci sequence, using the" +
                "recursive formula, is " + recursiveFib(10));
    }

    public static long recursiveFib(int nth) {
        if ((nth == 0) || (nth == 1)) {
            return nth;
        } else {
            return recursiveFib(nth - 1) + recursiveFib(nth -2);
        }
    }
}
