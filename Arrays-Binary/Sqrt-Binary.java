package StucturesClass;
import java.text.DecimalFormat;

class Hw2BinarySearchSqrRt {
    public static void main(String[] args) {

        int num = 9;
        int iterations = 10;
        int n = 2;

        System.out.println(nthRootFinder(num, iterations, n));
        System.out.println(sqrtFinder(num, iterations));

    }

    public static String sqrtFinder(int num, int iterations){
        DecimalFormat df = new DecimalFormat("#.#####");
        double left = 1;
        double right = num;
        double mid = 0;
        int i=0;
        while (i<iterations)
        {
            mid = (left + right) / 2;
            if (mid * mid < num)
            {
                left = mid;
            }
            else
            {
                right = mid;
            }
            i++;
        }
        return df.format(mid);
        }
    public static String nthRootFinder(int num, int iterations, int n) {
        DecimalFormat df = new DecimalFormat("#.#####");
        double left = 1;
        double right = num;

        double mid = 0;
        for (int k = 0; k < iterations; k++) {
            mid = left + (right - left) / 2;

            if (Math.pow(mid, n) == num) {
                return df.format(mid);
            } else if (Math.pow(mid, n) < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return df.format(mid);
    }
}
