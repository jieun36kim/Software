package ex_DIP;

public class SuperMario extends Games{
	public SuperMario() {
		title = returnTitle();
		version = returnVersion();
	}
	public String returnTitle() {
		return " SuperMario";
	}
	public String returnVersion() {
		return "v1.0";
	}
}
