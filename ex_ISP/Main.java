package ex_ISP;

public class Main {
	public static void main(String[] arg) {
		Ray r = new Ray();
		System.out.println(r.drive());
		System.out.println(r.breakk());
		Telsa t = new Telsa();
		System.out.println(t.autoDrive());
		System.out.println(t.autoParking());
		System.out.println(t.drive());
		System.out.println(t.breakk());
	}
}
