package sgtintern;

public class Encapsulationex {

	public static void main(String[] args) {
		Encapsulationhide hide= new Encapsulationhide("chethan",1,"bengaluru");
		hide.setId(3);
		hide.setName("Rukshadhya");
		hide.setPlace("pune");
		System.out.println("Name="+hide.getName()+"Id="+hide.getId()+"Place="+hide.getPlace());	
}}
class Encapsulationhide
{	private String name; private int id; private  String place;
public Encapsulationhide(String name, int id, String place) {
	this.name = name;
	this.id = id;
	this.place = place;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}}
