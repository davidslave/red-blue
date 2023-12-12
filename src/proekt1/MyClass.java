package proekt1;

public class MyClass {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setRed("red");

		Vehicle v2 = new Vehicle();
		v2.setBlue("blue");

		System.out.println("Vehicle 1: " + v1.getRed());
		System.out.println("Vehicle 2: " + v2.getBlue());
	}
}