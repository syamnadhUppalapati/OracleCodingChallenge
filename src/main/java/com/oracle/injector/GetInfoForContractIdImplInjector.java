package com.oracle.injector;

import com.oracle.consumer.MainConsumerClass;
import com.oracle.service.GetInfoForContractIdImpl;

public class GetInfoForContractIdImplInjector implements GetInfoServiceInjector{

	//Singleton Design Pattern
	private static MainConsumerClass mainConsumerClass = new MainConsumerClass(new GetInfoForContractIdImpl());
	
	public MainConsumerClass getConsumerClass() {
		return mainConsumerClass;
	}

}
