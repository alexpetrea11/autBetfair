package homeworks.JavaIntro;



public class PrimeNumbers {
    public static void  findPrimeNumbers(){
        for(int i=2; i<=1000000;i++)
        {
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isPrime(int num){
        if (num<2){
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for(int i=3; i<=num/2;i+=2)
        {
            if (num%i ==0)
            {
                return false;
            }
        }
    return true;
    }
}
