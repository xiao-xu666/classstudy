package Dem2.homework1;

public class MinCommonMultiple {
    private int a;
    private int b;
    private int i=0;
    public MinCommonMultiple(){
        this.a=0;
        this.b=0;
    }
    public void setNumber(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int result(){
        while(true){
            i++;
            if(i%a==0&&i%b==0){
                return i;
            }
        }
    }
}
