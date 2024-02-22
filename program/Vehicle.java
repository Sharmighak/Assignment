package program;

public class Vehicle {
    public int num;
    public String name;
    
    public Vehicle(int num, String name) {
        this.num = num;
        this.name = name;
    }
    
    public int Horn() {
        return num;
    }
    
    public void Break() {
        System.out.println("Break");
    }
    
    public void tire() {
        System.out.println("tire");
    }
    
    
  

    public static void main(String[] args) {
        Vehicle obj = new Vehicle(123, "audi");
       System.out.println( obj.Horn());
        obj.Break();
        obj.tire();
        
    }
}
