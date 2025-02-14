
public class Car {
	
	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
	
	public String getMake() { return make; }
	public int getYear() { return year; }
	public String getModel() { return model; }
	
	public void setMake(String make) { this.make = make; }
	public void setYear(int year) { this.year = year; }
	public void setModel(String model) { this.model = model; }
}
