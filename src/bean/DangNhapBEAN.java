package bean;

public class DangNhapBEAN {
	
	private String user;
	private String name;
	private String pass;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public DangNhapBEAN(String user, String name, String pass) {
		super();
		this.user = user;
		this.name = name;
		this.pass = pass;
	}
	public DangNhapBEAN() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
