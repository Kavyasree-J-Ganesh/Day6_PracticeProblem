package logicalprograms;

public class FibonacciSeries {
    static void fibonacciNumbers(int n){
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i=2; i<n; i++) {
            int swap = first + second;
            first = second;
            second = swap;
            System.out.println(swap);
        }
    }
    public static void main(String[] args) {
        fibonacciNumbers(7);
    }
}
