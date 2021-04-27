package com.oracle.main;

import java.io.IOException;
import java.util.List;

import com.oracle.consumer.MainConsumerClass;
import com.oracle.entity.ProjectInfoEntity;
import com.oracle.injector.GetInfoForContractIdImplInjector;
import com.oracle.injector.GetInfoForGeoZoneImplInjector;
import com.oracle.injector.GetInfoServiceInjector;
import com.oracle.util.UtilClass;

public class MainApplication {
	public static void main(String[] args) throws IOException {

		List<ProjectInfoEntity> inputList = UtilClass.getInputList("src/main/resources/input.txt");

		GetInfoServiceInjector getInfoServiceInjector;
		MainConsumerClass mainConsumerClass;

		System.out.println("List Of Objects From InputList: " + inputList.size());

		if (!inputList.isEmpty()) {
			getInfoServiceInjector = new GetInfoForContractIdImplInjector();
			mainConsumerClass = getInfoServiceInjector.getConsumerClass();
			mainConsumerClass.processProjectInfo(inputList);

			getInfoServiceInjector = new GetInfoForGeoZoneImplInjector();
			mainConsumerClass = getInfoServiceInjector.getConsumerClass();
			mainConsumerClass.processProjectInfo(inputList);
		} else {
			System.out.println("******Please provide the valid inputlist!!******");
		}

	}
}
