public class passbyref2 {
    public static void main(String[] args) {
        domi d1 = new domi();
        zomato.parcel(d1);


    }
}
    class domi{
        void order( ) {
            System.out.println("you have pizza");
        }
    }

    class zomato{
        static void parcel(domi  d1){
            d1.order();

        }
    }



