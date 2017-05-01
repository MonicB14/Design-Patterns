package pattern.creational.factory;

public abstract class Car {
	
	private String brand;
	private String color;
	
	public String getBrand(){
		return brand;
	}
	public String getColor(){
		return color;
	}
	
	public void setBrand(String newBrand){
		brand = newBrand;
	}
	
	public void setColor(String newColor){
		color = newColor;
	}
}
