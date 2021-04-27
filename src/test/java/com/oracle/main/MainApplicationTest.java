package com.oracle.main;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.oracle.consumer.MainConsumerClass;
import com.oracle.entity.ProjectInfoEntity;
import com.oracle.injector.GetInfoForContractIdImplInjector;
import com.oracle.injector.GetInfoForGeoZoneImplInjector;
import com.oracle.injector.GetInfoServiceInjector;
import com.oracle.util.UtilClass;

public class MainApplicationTest {

	private GetInfoServiceInjector getInfoServiceInjector;
	
	private MainConsumerClass mainConsumerClass;

	@Test
	public void emptyInputFileTest() throws IOException {
		List<ProjectInfoEntity> inputList = UtilClass.getInputList("src/main/resources/emptyInput.txt");

		System.out.println("\nList Of Objects From InputList: " + inputList.size());

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
	
	@Test
	public void EmptyContractIdTest() throws IOException {
		List<ProjectInfoEntity> inputList = UtilClass.getInputList("src/main/resources/emptyContractIdInput.txt");

		System.out.println("\nList Of Objects From InputList: " + inputList.size());

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
