package com.oracle.injector;

import com.oracle.consumer.MainConsumerClass;
import com.oracle.service.GetInfoForGeoZoneImpl;

public class GetInfoForGeoZoneImplInjector implements GetInfoServiceInjector{

	//Singleton Design Pattern
	private static MainConsumerClass mainConsumerClass = new MainConsumerClass(new GetInfoForGeoZoneImpl());
	
	public MainConsumerClass getConsumerClass() {
		return mainConsumerClass;
	}

}
