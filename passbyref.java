public class passbyref {
    int a=4;
    static void sample(passbyref r2){
       System.out.println(r2.a);
    }
    public static void main(String [] args){
        passbyref r1=new passbyref();
        sample( r1);
//        System.out.println(r1.a);
    }
}
