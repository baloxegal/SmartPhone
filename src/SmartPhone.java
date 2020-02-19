
public class SmartPhone {
	
	private String brand;
	private Integer year;
	private String model;
	private Double diagonal;
	private Integer memory;
	private Integer cores;
	private Integer battery;
	
	public SmartPhone(String brand, Integer year, String model, Double diagonal) {
		this.brand = brand;
		this.year = year;
		this.model = model;
		this.diagonal = diagonal;
	}
	
	public String toString() {
		return "Smartphone brand = " + brand + ", year = " + year + ", model = " + model + ", diagonal = " + diagonal + 
				", memory = " + memory + ", cores = " + cores + ", battery = " + battery;
	}
	
	public static class Builder{
		private SmartPhone newSmartPhone;
		
		public Builder(String brand, Integer year, String model, Double diagonal) {
			newSmartPhone = new SmartPhone(brand, year, model, diagonal);
		}
		public Builder withMemory(Integer memory) {
			newSmartPhone.memory = memory;
			return this;
		}
		public Builder withCores(Integer cores) {
			newSmartPhone.cores = cores;
			return this;
		}
		public Builder withBattery(Integer battery) {
			newSmartPhone.battery = battery;
			return this;
		}
		public SmartPhone build() {
			return newSmartPhone;
		}
	}
}
