// this is for polymorphisum
//class Animal1{
//    void noise(){
//        System.out.println("animal noise");
//    }
//}
//class snake extends Animal1{
//    void noise(){
//        System.out.println("snake noise");
//    }
//}
//class dog extends Animal1 {
//    void noise(){
//        System.out.println("dog noise");
//    }
//}
//class cat extends Animal1{
//    void noise(){
//        System.out.println("cat noise");
//    }
//}
//
//class simu{
//   static void ansim(Animal1 a1){
//        a1.noise();
//    }
//}
//
//public class poly {
//    public static void main(String[] args) {
//        cat c1=new cat();
//        dog d1=new dog();
//        snake s1=new snake();
//        simu.ansim(c1);
//        simu.ansim(d1);
//        simu.ansim(s1);
//    }
//}


// this is for abstraction
// abstract class
abstract class Animal1{
    void noise(){
        System.out.println("animal noise");
    }

}
class snake extends Animal1 {
    public void noise(){
        System.out.println("snake noise");
    }
}
class dog extends Animal1 {
    public void noise(){
        System.out.println("dog noise");
    }
}
class cat extends Animal1{
    public void noise(){
        System.out.println("cat noise");
    }
}

class simu{
    static void ansim(Animal1 a1){
        a1.noise();
    }
}

public class poly {
    public static void main(String[] args) {
        cat c1=new cat();
        dog d1=new dog();
        snake s1=new snake();
        simu.ansim(c1);
        simu.ansim(d1);
        simu.ansim(s1);
    }
}
