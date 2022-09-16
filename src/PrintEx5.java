public class PrintEx5 {
    public static void main(String[] args) {
        Ex5 x=new Ex5(100000);

        x.mystery(new Ex5(),1000);
        System.out.println(x.getbalans());
    }
}
