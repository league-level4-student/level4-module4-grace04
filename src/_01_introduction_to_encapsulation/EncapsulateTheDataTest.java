package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EncapsulateTheDataTest {

	EncapsulateTheData etd = new EncapsulateTheData();
	
	@Test
	void testItemsReceived() {
		etd.setItemsReceived(5);
		assertEquals(5, etd.getItemsReceived());
		etd.setItemsReceived(-2);
		assertEquals(0, etd.getItemsReceived());
	}
	
	@Test
	void testDegreesTurned() {
		etd.setDegreesTurned(180);
		assertEquals(180, etd.getDegreesTurned());
		etd.setDegreesTurned(-60);
		assertEquals(0, etd.getDegreesTurned());
		etd.setDegreesTurned(720);
		assertEquals(360, etd.getDegreesTurned());
	}
	
	@Test
	void testNomenclature() {
		etd.setNomenclature("Name");
		assertEquals("Name", etd.getNomenclature());
		etd.setNomenclature("");
		assertEquals(" ", etd.getNomenclature());
	}
	
	@Test
	void testMemberObj() {
		etd.setMemberObj(true);
		assertEquals(Boolean.class, etd.getMemberObj().getClass());
		etd.setMemberObj(2);
		assertEquals(Integer.class, etd.getMemberObj().getClass());
		etd.setMemberObj("no");
		assertEquals(Object.class, etd.getMemberObj().getClass());
	}
}
