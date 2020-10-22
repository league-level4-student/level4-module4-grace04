package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	int itemsReceived; //must not be negative. All negative arguments get set to 0.
	float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public static void main(String[] args) {
		
	}
	
	int getItemsReceived() {
		return itemsReceived;
	}
	
	void setItemsReceived(int x) {
		itemsReceived = x;
		if(x<0)
			itemsReceived = 0;
	}
	
	float getDegreesTurned() {
		return degreesTurned;
	}
	
	void setDegreesTurned(float x) {
		degreesTurned = x;
		if(x<0.0)
			degreesTurned = 0;
		else if(x>360.0)
			degreesTurned = 360;
	}
	
	String getNomenclature() {
		return nomenclature;
	}
	
	void setNomenclature(String s) {
		nomenclature = s;
		if(s.isEmpty())
			nomenclature = " ";
	}
	
	Object getMemberObj() {
		return memberObj;
	}
	
	void setMemberObj(Object obj) {
		if(obj instanceof String)
			obj = new Object();
		memberObj = obj;
	}
}
