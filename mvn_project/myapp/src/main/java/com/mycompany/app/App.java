package mvn_project.myapp.src.main.java.com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("The 10th term of the fibonacci sequence, using the " +
                "recursive formula, is " + recursiveFib(10));
    }

    /**
     * A recursively called function that calculates the nth term
     * of the fibonacci sequence.
     * The fibonacci sequence is Fn = Fn-1 + Fn-2
     * And the recursive function is the implementation of that.
     *
     * @param nth the nth term being asked for in the fibonacci sequence
     * @return the resulting nth term of the sequence after calculation
     */
    public static long recursiveFib(int nth) {
        if ((nth == 0) || (nth == 1)) {
            return nth;
        } else {
            return recursiveFib(nth - 1) + recursiveFib(nth -2);
        }
    }
}
