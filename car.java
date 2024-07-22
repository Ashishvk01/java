public class car {
    String color;
    int no;
    int price;

    car(String color,int no,int price){
        this.color=color;
        this.no=no;
        this.price=price;
    }

    public static void main(String[] args) {
        car c=new car("red",3333,100000);
        System.out.println(c.color);
        System.out.println(c.no);
        System.out.println(c.price);
    }
}
