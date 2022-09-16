public class Print_Ex7 {
    public static void main(String[] args) {
    Ex7_timeDepositAccount b=new Ex7_timeDepositAccount(1000,10);
    b.getRate();
        System.out.println("balanc with rate: "+b.getbalans());
    b.withedraw();
        System.out.println("balanc withdraw: "+b.getbalans());
}}
