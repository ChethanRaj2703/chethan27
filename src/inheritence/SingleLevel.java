package inheritence;

class Car
{
int version=2;
String company="Honda";
public void carfeatures()
{
	System.out.println("car company :"+company);
    System.out.println("version="+version);
    System.out.println("Comes with 6 air bags,ABS");	
}
}
class Model extends Car
{
int year=2019;
public void details()
{
System.out.println("the car name is honda city");	
}
}

public class SingleLevel { 
	public static void main(String[] args) {
		Model m=new Model();
		System.out.println(m.company);	
	    System.out.println(m.version);
	    System.out.println(m.year);	

	    
	    m.carfeatures();
	    m.details();
	    
	}

}
