
public class Application {

	public static void main(String[] args) {
		
		SmartPhone smartPhone1 = new SmartPhone.Builder("Samsung", 2020, "S 10", 6.3).withMemory(256).withCores(16).withBattery(6000).build();
		
		System.out.println(smartPhone1.toString());
		
		SmartPhone smartPhone2 = new SmartPhone.Builder("IPhone", 2020, "11 Pro", 6.1).withMemory(512).withCores(16).withBattery(4000).build();
		
		System.out.println(smartPhone2.toString());
	}
}
