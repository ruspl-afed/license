package com.aivhub.licensing;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.passage.lic.api.ServiceInvocationResult;
import org.eclipse.passage.lic.api.registry.StringServiceId;
import org.eclipse.passage.lic.api.requirements.Requirement;
import org.eclipse.passage.lic.api.requirements.ResolvedRequirements;
import org.eclipse.passage.lic.api.restrictions.RestrictionLevel;
import org.eclipse.passage.lic.base.BaseServiceInvocationResult;
import org.eclipse.passage.lic.base.requirements.BaseFeature;
import org.eclipse.passage.lic.base.requirements.BaseRequirement;

final class AivhubRequirements implements ResolvedRequirements {

	@Override
	public StringServiceId id() {
		return new StringServiceId("aivhub");
	}

	@Override
	public ServiceInvocationResult<Collection<Requirement>> all() {
		//FIXME: AF: we can either hard code them here or read from some config
		Collection<Requirement> all = new ArrayList<>();
		//let's start from using type as feature identifier
		all.add(new BaseRequirement(//
				new BaseFeature("dash", "1.0.0", "Dashboards", "AIVHUB LTD"), //
				new RestrictionLevel.Error(), //
				this));
		all.add(new BaseRequirement(//
				new BaseFeature("ds", "1.0.0", "DS (BTW, what does it stand for?)", "AIVHUB LTD"), //
				new RestrictionLevel.Error(), //
				this));
		return new BaseServiceInvocationResult<Collection<Requirement>>(all);
	}

}
