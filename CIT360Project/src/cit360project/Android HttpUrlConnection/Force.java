public class Force {
	private double engine;
	private int horses;
	
	public Force() {
		super();
	}

	public Force(float engine, int horses) {
		this.engine = engine;
		this.horses = horses;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public int getHorses() {
		return horses;
	}

	public void setHorses(int horses) {
		this.horses = horses;
	}
}