package com.oracle.service;

import java.util.List;
import java.util.stream.Collectors;

import com.oracle.entity.ProjectInfoEntity;

public class GetInfoForGeoZoneImpl implements GetInfoService{

	public void getRequiredInfo(List<ProjectInfoEntity> inputList) {
		List<String> UniqueGoeZoneList = inputList.stream().map(x -> x.getGeoZone()).distinct()
				.collect(Collectors.toList());
		System.out.println("\n*******Below are the number of unique customerId's for each geozone*******");
		for (String geoZone : UniqueGoeZoneList) {
			List<String> geoZoneList = inputList.stream().filter(x -> geoZone.equalsIgnoreCase(x.getGeoZone()))
					.map(x -> x.getCustomerId()).collect(Collectors.toList());
			int geoZoneListCount = geoZoneList.size();
			System.out
					.println("\nThe number of unique customerId for geozone : " + geoZone + " is :" + geoZoneListCount);
			System.out.println("The List of unique customerId for geozone : " + geoZone + " are :" + geoZoneList);

			List<String> buildDurationList = inputList.stream().filter(x -> geoZone.equalsIgnoreCase(x.getGeoZone()))
					.map(x -> x.getBuildDuration()).collect(Collectors.toList());
			System.out.println("The List of buildDurations for geozone : " + geoZone + " are :" + buildDurationList);
			System.out.println("The average buildduration for geozone : " + geoZone + " is :"
					+ String.valueOf(buildDurationList.stream().mapToInt(x -> Integer.parseInt(x)).average().getAsDouble()).replace(".0", "s"));
		}
	}

}
