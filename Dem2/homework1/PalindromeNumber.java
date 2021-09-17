package Dem2.homework1;

public class PalindromeNumber {
    private int number;
    private int a=0,b=0;
    public PalindromeNumber(){
        this.number=0;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public boolean isPalindrome(){
        a=number;
        while(a>0){
            b=b*10+a%10;
            a=a/10;
        }
        if(b==number){
            return true;
        }else return false;

    }
}
