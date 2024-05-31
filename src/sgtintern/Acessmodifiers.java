package sgtintern;

public class Acessmodifiers {

    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;

    
    public void publicMethod() { System.out.println("This is a public method."); }
    private void privateMethod() { System.out.println("This is a private method."); }
    protected void protectedMethod() { System.out.println("This is a protected method."); }
    void defaultMethod() {System.out.println("This is a default method.");}

    public static void main(String[] args) {
        Acessmodifiers example = new Acessmodifiers();

        System.out.println("Public variable: " + example.publicVar);
       // private variable cannot access 
      // System.out.println("Private variable: " + example.privateVar);
        System.out.println("Protected variable: " + example.protectedVar);
        System.out.println("Default variable: " + example.defaultVar);
        example.publicMethod();
        // private method cannot access 
        // example.privateMethod();
        example.protectedMethod();
        example.defaultMethod();
    }
}
