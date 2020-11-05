package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> docs = new ArrayList<Doctor>();
	ArrayList<Patient> pats = new ArrayList<Patient>();
	
	Hospital(){
		
	}
	
	public ArrayList<Doctor> getDoctors() {
		return docs;
	}
	
	public void addDoctor(Doctor d) {
		docs.add(d);
	}
	
	public ArrayList<Patient> getPatients() {
		return pats;
	}
	
	public void addPatient(Patient p) {
		pats.add(p);
	}
	
	public void assignPatientsToDoctors() throws DoctorFullException {
		int i = 0;
		for (Doctor d : docs) {
			while(d.getPatients().size()<3&&i<pats.size()) {
				d.assignPatient(pats.get(i));
				i++;
			}
		}
	}
}
