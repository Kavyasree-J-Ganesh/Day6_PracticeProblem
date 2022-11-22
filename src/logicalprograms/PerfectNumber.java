package logicalprograms;

public class PerfectNumber {
    static void findPerfectNumber(int num){
        int sumOfDivisors = 0;
        for(int i=1; i<=num/2; i++){
            if(num % i == 0){
                System.out.println(i);
                sumOfDivisors = sumOfDivisors + i;
            }
        }
        if( sumOfDivisors == num ){
            System.out.println("This is a perfect Number");
        }else{
            System.out.println("This is not a perfect Number");
        }
    }
    public static void main(String[] args) {
        findPerfectNumber(8);
    }
}
