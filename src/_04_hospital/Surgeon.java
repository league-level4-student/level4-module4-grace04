package _04_hospital;

public class Surgeon extends Doctor{
	@Override
	public boolean performsSurgery() {
		return true;
	}

	@Override
	public boolean makesHouseCalls() {
		return false;
	}
}
