package com.aivhub.licensing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.aivhub.Dashboard;
import com.aivhub.Documents;
import com.aivhub.Master;

public class LicensingTest {

	@Test
	public void testDocumentNoLicense() {
		//license not checked
		assertFalse(new Documents().hello().isEmpty());
	}

	@Test
	public void testDashNoLicense() {
		//license not present
		assertTrue(new Dashboard().hello().isEmpty());
	}

	@Test
	public void testMasterNoLicense() {
		//license not present
		assertTrue(new Master().hello().isEmpty());
	}
}
