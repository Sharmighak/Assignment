package day2Work;

public class Calculator {
    
    public int add(int a, int b) {
        
        return a + b;
    }
    
    public int sub(int a, int b) {
        return a - b;
    }
    
    public int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator cul = new Calculator();
        System.out.println(cul.add(10, 20));
        System.out.println(cul.sub(10, 20));
        System.out.println(cul.mul(10, 20));
    }
}
