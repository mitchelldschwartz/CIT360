import java.util.List;

public class Car {
	private String brand;
	private String model;
	private List<Force> forces;
	
	public void car() {
	}
	
	public void car(String brand, String Model, List<Force> forces, String model) {
		this.brand = brand;
		this.model = model;
		this.forces = forces;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Force> getForces() {
		return forces;
	}

	public void setForces(List<Force> forces) {
		this.forces = forces;
	}
}