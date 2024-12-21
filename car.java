abstract class vechicle{
    public abstract void drive ();
    public abstract void fly ();
     public void playmusic()
    {
        System.out.println("play music");
    }

    }
abstract class WagonR extends vechicle
{
    public void fly(){
        System.out.println("Flying...");
    }
    public void drive (){
        System.out.println("Driving...");
    }
}
class updateWagonR extends WagonR
{
  public void fly(){
    System.out.println("Flying....");
  }
}
public class car {
    public void main(String a[]){
        vechicle obj = new updateWagonR();
        obj.drive();
        obj.playmusic();
        obj.fly();
        System.out.println();

    }
    
}
