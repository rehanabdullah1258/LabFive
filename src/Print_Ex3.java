public class Print_Ex3 {
    public static void main(String[] args) {
        Ex3_PankAccount b=new Ex3_PankAccount();
        b.debosit(1000);
        System.out.println("debosit: "+b.getbalans());
        b.withedraw(500);
        b.withedraw(400);
        System.out.println("the rest: "+b.getbalans());
    }
}
