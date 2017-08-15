class car
{
 private String model;
 private String color;
 private double price;
 
 car(String model, String color, double amount)
 {
 	this.model = model;
	this.color = color;
	this.price = amount;
 }
 
	public void Display()
	{
    System.out.println("The model of the car is " +model + "\n The color of the car is " + color + "\nThe price of the car is "+ price);	
	}

 public void setPrice(double newPrice)
{
  this.price = newPrice;
  
 }
 
 }
 
public class Dealership
{

	public static void main(String[] args)
	{
	car obj = new car("M3", "Champagne Silver", 345000.45);
	obj.Display();
	}
}
