package bean;

public class BacSiBEAN {
	private String DoctorID;
	private String DoctorName;
	private String Address;
	private String PhoneNumber;
	public String getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(String doctorID) {
		DoctorID = doctorID;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public BacSiBEAN(String doctorID, String doctorName, String address, String phoneNumber) {
		super();
		DoctorID = doctorID;
		DoctorName = doctorName;
		Address = address;
		PhoneNumber = phoneNumber;
	}
	public BacSiBEAN() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
