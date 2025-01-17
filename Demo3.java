abstract class Computer {

    public abstract void code();
}

class Desktop extends Computer
{
    public void code()
    { 
       System.out.println("code,compile,run : faster");
   }
}

class Laptop extends Computer
{
    public void code()
    {
        System.out.println("code,compile,run");
    }
    
}

class Developer
{
    public void devApp(Computer lap)
    {
       lap.code();
    }
}


public class Demo3 {
    public static void main (String arg[])
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        
        Developer jino = new Developer();
        jino.devApp(lap);
    }
}
