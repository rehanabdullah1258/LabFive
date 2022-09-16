public class Print_Ex6 {
    public static void main(String[] args) {
        Ex6 x=new Ex6(1000,10);
        x.addinerest();
        System.out.println("expected value: 1100");
        System.out.println("actual value: "+x.getbalans());
    }
}
