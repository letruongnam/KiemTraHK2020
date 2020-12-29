package bean;

import java.util.Date;

public class BenhAnBEAN {
	private String PatientID;
	private String doctorID;
	private Date examineDate;
	private String result;
	private String treatment;
	public BenhAnBEAN(String patientID, String doctorID, Date examineDate, String result, String treatment) {
		super();
		PatientID = patientID;
		this.doctorID = doctorID;
		this.examineDate = examineDate;
		this.result = result;
		this.treatment = treatment;
	}
	public String getPatientID() {
		return PatientID;
	}
	public void setPatientID(String patientID) {
		PatientID = patientID;
	}
	public String getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}
	public Date getExamineDate() {
		return examineDate;
	}
	public void setExamineDate(Date examineDate) {
		this.examineDate = examineDate;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public BenhAnBEAN() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
