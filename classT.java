class Animal{
    void disp(){
        System.out.println("the animal");
    }
}
class Fish extends Animal{
    void disp(){
        System.out.println("the fish");
    }
}

public class classT {
    public static void main(String[] args) {
//       Fish f1=new Fish();
//        f1.disp();

        Animal a1=new Fish();
        a1.disp();
        Fish a2=(Fish) a1;
        a2.disp();
    }
}
