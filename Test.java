import Dem1.homework1.mypackage.Compute;
import Dem2.homework1.MinCommonMultiple;
import Dem2.homework1.PalindromeNumber;

public class Test {
    public static void main(String[] args) {
        int a = 10, b = 2;
        Compute compute = new Compute();
        System.out.println("四则运算");
        System.out.println("a="+a+", b="+b);
        System.out.println("a+b="+compute.plus(a,b));
        System.out.println("a-b="+compute.subtract(a,b));
        System.out.println("a*b="+compute.multiply(a,b));
        System.out.println("a/b="+compute.divide(a,b));
        //P40页编程题第二题


        System.out.println("");
        System.out.println("########################");
        System.out.println("");


        System.out.println("最小公倍数");
        int c=12,d=18;
        MinCommonMultiple minCommonMultiple = new MinCommonMultiple();
        minCommonMultiple.setNumber(c,d);
        System.out.println("c="+c+", d="+d+",c和d的最小公倍数为:"+minCommonMultiple.result());
        //P60页编程题第一题


        System.out.println("");
        System.out.println("########################");
        System.out.println("");


        System.out.println("判断回文数");
        int e=121,f=38783,g=12345;
        int i=0;
        PalindromeNumber palindromeNumber1 = new PalindromeNumber();
        palindromeNumber1.setNumber(e);
        PalindromeNumber palindromeNumber2 = new PalindromeNumber();
        palindromeNumber2.setNumber(f);
        PalindromeNumber palindromeNumber3 = new PalindromeNumber();
        palindromeNumber3.setNumber(g);
        System.out.println("e="+e+" , f="+f+" , g="+g+"\n"+"e是否为回文数:"+ palindromeNumber1.isPalindrome()+"\n"+"f是否为回文数:"+palindromeNumber2.isPalindrome()+"\n"+"g是否为回文数:"+palindromeNumber3.isPalindrome());
        //P61页编程题第四题
    }
}
