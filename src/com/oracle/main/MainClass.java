package com.oracle.main;

import java.io.IOException;
import java.util.List;

import com.oracle.entity.ProjectInfoEntity;
import com.oracle.service.GetInfoService;
import com.oracle.util.UtilClass;

public class MainClass {
	
	public static void main(String[] args) throws IOException {
		List<ProjectInfoEntity> inputList = UtilClass.getInputList("C:\\Users\\HI\\Desktop\\JAVA Coding\\OracleCodingChallenge\\resources\\input.txt");
		getRequiredInfo(inputList);
	}

	public static void getRequiredInfo(List<ProjectInfoEntity> inputList) {
		GetInfoService getInfoService = new GetInfoService();
		getInfoService.getCustomerIdsForContractId(inputList);
		getInfoService.getCustomerIdsForgeoZone(inputList);
	}
	
	
}
