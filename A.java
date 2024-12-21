class B{
    int age;

    public void show(){
        System.out.println("in show");
    }
static class C
{
    public void config()
    {
        System.out.println("in config");
    }
}

}
public class A {
    public static void main(String a[])
    {
    B obj = new B();
    obj.show();

    B.C obj1 = new B.C ();
    obj1.config();
}
}
