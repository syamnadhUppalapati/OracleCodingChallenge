package com.oracle.consumer;

import java.util.List;

import com.oracle.entity.ProjectInfoEntity;
import com.oracle.service.GetInfoService;

public class MainConsumerClass implements MainConsumerInterface {

	private GetInfoService getInfoService;

	public MainConsumerClass(GetInfoService getInfoService) {
		this.getInfoService = getInfoService;
	}

	public void processProjectInfo(List<ProjectInfoEntity> inputList) {
		// TODO Auto-generated method stub
		getInfoService.getRequiredInfo(inputList);

	}

}
