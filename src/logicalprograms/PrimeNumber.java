package logicalprograms;

public class PrimeNumber {
    static String checkPrime(int num){
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                return "Not a Prime Number";
            }
        }
        return "Prime Number";
    }
    public static void main(String[] args){
        String prime = checkPrime(12);
        System.out.println(prime);
    }
}
