import java.util.*;
import java.math.*;
import java.lang.*;

public class Fibonacci {
    static int Fibo(int n){ 
        if(n == 0){
            return 0;
        }
        int p = 0;
        int q = 1;
        for(int i = 1;i<n;i++ ){
            q = p + q;
            p = q - p;        
          }
        return q;        
    }
    
    static byte Fibo2(byte n){  
        if(n == 0){
            return 0;
        }
        byte p = 0;
        byte q = 1;
        for(byte i = 1;i<n;i++ ){
            q =	(byte) (p + q);
            p = (byte)(q - p);           
        }
        return q;        
    }
    
    static short Fibo3(short n){
        if(n==0){
            return 0;
        }
        short l = 0;
        short m = 1;
        for(short i = 1;i<n;i++ ){
            m =	(short) (l + m);
            l = (short)(m - l);           
         }
        return m;        
    }
    
    static long Fibo4(long n){
        if(n==0){
            return 0;
        }
        long a=0;
        long b = 1;
        for(long i = 1;i<n;i++ ){
            b=(a+b);
            a=(b-a);
        }
        return b;        
    }
    
    static BigInteger Fibo5(BigInteger n){
        if(n.equals(BigInteger.ZERO)){
            return BigInteger.ZERO;
        }
        BigInteger a=BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for(BigInteger i = BigInteger.ONE;i.compareTo(n) < 0;i=i.add(BigInteger.ONE) ){
            b =	a.add(b);
            a = b.subtract(a);
         }
        return b;        
    }
    
    public static void main(String[] args) {
        System.out.println("Input byte, short, int, long and BigInteger:");
        Scanner scan = new Scanner(System.in);
        byte a = scan.nextByte(); // overflow después de fibonacci de 46
        short b = scan.nextShort(); //overflow después de fibonacci de 11
        int c = scan.nextInt(); //overflow después de fibonacci de 23
        long d = scan.nextLong(); //overflow después de fibonacci de 92
        BigInteger e = scan.nextBigInteger();  //no hay
        System.out.println("Fibonacci:");
        System.out.println("byte [" + Fibo(c) + "], " + "short [" +Fibo2(a) + "], " + "int ["+ Fibo3(b) + "], " + 
                "long [" + Fibo4(d) + "], " + "BigInteger [" + Fibo5(e) + "]");
        //System.out.println(fibo5(e)); //descomentar si quiere saber solo el fibonacci del BI
    }
    
}
