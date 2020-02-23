package playground;

public class JavaPlayground {
    public static void main(String args[]) {
        System.out.println("hello java");
    }

    public double recursiveSumHelper(double[] a, double sum, int index){
        if (index == a.length)
            return sum;
        sum += a[index];
        return recursiveSumHelper(a, sum, index + 1);
    }
    public double recursiveSum(double[] a) {
        return recursiveSumHelper(a, 0.0, 0);
    }

}
