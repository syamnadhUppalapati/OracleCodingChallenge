package com.oracle.service;

import java.util.List;
import java.util.stream.Collectors;

import com.oracle.entity.ProjectInfoEntity;

public class GetInfoForContractIdImpl implements GetInfoService {

	public void getRequiredInfo(List<ProjectInfoEntity> inputList) {
		List<String> UniqueContactIdList = inputList.stream().map(x -> x.getContractId()).distinct()
				.collect(Collectors.toList());
		System.out.println("\n*******Below are the number of unique customerId's for each contractId*******");
		for (String contractId : UniqueContactIdList) {
			if(!contractId.isEmpty()) {
			int contractIdListCount = inputList.stream().filter(x -> contractId.equalsIgnoreCase(x.getContractId()))
					.collect(Collectors.toList()).size();
			System.out.println(
					"The number of unique customerId for contractId : " + contractId + " is :" + contractIdListCount);
			}
		}

	}

}
