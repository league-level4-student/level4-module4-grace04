package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	ArrayList<Patient> pats = new ArrayList<Patient>();
	
	Doctor(){
		
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (pats.size()>=3) {
			throw new DoctorFullException();
		} else {
			pats.add(patient);
		}

	}

	public void doMedicine() {
		for(Patient p : pats) {
			p.checkPulse();
		}
	}
	
	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}

	public ArrayList<Patient> getPatients() {
		return pats;
	}
}
