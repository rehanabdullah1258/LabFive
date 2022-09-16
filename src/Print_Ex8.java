public class Print_Ex8 {
    public static void main(String[] args) {
        Ex8 x=new Ex8(1000);
        x.withedraw(100,1);
        x.withedraw(100,2);
        x.debosit(100,5);
        x.withedraw(100,1);
        x.withedraw(100,3);
        x.withedraw(100,4);
        System.out.println("in five month: "+x.getbalans());
        x.withedraw(100,7);
        x.debosit(100,8);
        System.out.println("after five month: "+x.getbalans());

    }
}
