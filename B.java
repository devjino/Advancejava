class A
{
    public void show()
    {
        System.out.println("in show");
    }

}
public class B {
    public static void main(String a []){
        B obj = new B()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
