public class Main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The value of term " + n + " in the Fibonacci sequence is " + fibSeq(10));
    }

    public static long fibSeq(int nthTerm)
    {
        // For terms 0 and 1, you can't do fn = fn-1 + fn-2.
        if (nthTerm == 0 || nthTerm == 1) {
            return nthTerm;
        }

        // For any terms after, do fn = fn-1 + fn-2.
        return fibSeq(nthTerm - 1) + fibSeq(nthTerm - 2);
    }
}