interface A{

    int age=21;
    String area ="Mumbai";
    void show();
    void config();

}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
}

public class helo
 {
    public void main(String a[])
    {
     A obj;
     obj = new B();

     obj.show();
     obj.config();
   
     System.out.println(A.area);
    }
}
