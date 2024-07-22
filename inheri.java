class inher{
    int b=10;
}
public class inheri extends inher {
    int a=10;
     void cake(){
        System.out.println("this class can be inherited ");
    }
}
class inhe extends inher{
    int c=10;
}

class inheri2 extends inheri {
    public static void main(String[] args) {
       inheri2 i=new inheri2();
        System.out.println(i.a);
        System.out.println(i.b);
        i.cake();
        inhe i1=new inhe();
        System.out.println(i1.b);
        System.out.println(i1.c);

    }
}
