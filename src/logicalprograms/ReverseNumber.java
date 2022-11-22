package logicalprograms;

public class ReverseNumber {
    static void reverseNumber(int n){
        int reverse = 0;
        while(n >0){
            int mod = n % 10;
            reverse = (reverse * 10) + mod;
            n = n / 10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args){
        reverseNumber(98765);
    }
}
