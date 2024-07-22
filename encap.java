

 class sample{
     private int password=10;
     int getPassword(){
        return password;
    }
    void setPassword(int password){
         this.password=password;
    }

}
public class encap {
    public static void main(String[] args) {
        sample s1=new sample();
        System.out.println(  s1.getPassword());
        s1.setPassword(15);
        System.out.println(  s1.getPassword());
    }
}
