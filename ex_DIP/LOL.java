package ex_DIP;

public class LOL extends Games{
	public LOL() {
		title = returnTitle();
		version = returnVersion();
	}
	public String returnTitle() {
		return " Langue of Legends";
	}
	public String returnVersion() {
		return "v.2020";
	}
}
