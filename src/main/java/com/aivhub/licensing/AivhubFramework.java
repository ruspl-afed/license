package com.aivhub.licensing;

import org.eclipse.passage.lic.api.AccessCycleConfiguration;
import org.eclipse.passage.lic.api.Framework;
import org.eclipse.passage.lic.api.LicensedProduct;
import org.eclipse.passage.lic.base.BaseLicensedProduct;

final class AivhubFramework implements Framework {

	@Override
	public LicensedProduct product() {
		//FIXME: AF: read from manifest?
		String product = "com.aivhub.product";
		String version = "1.0.0";
		return new BaseLicensedProduct(product, version);
	}

	@Override
	public AccessCycleConfiguration accessCycleConfiguration() {
		return new AivhubConfiguration(this::product);
	}

}
