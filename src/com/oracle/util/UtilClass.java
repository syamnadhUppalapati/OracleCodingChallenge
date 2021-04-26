package com.oracle.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.oracle.entity.ProjectInfoEntity;

public class UtilClass {

	
	public static List<ProjectInfoEntity> getInputList(String filePath) throws IOException {
		String line = "";
		List<ProjectInfoEntity> inputList = new ArrayList<>();
		BufferedReader br = new BufferedReader(
				new FileReader(filePath));
		while ((line = br.readLine()) != null) {
			String[] data = line.split(",");
			inputList.add(new ProjectInfoEntity(data[0], data[1], data[2], data[3], data[4], data[5].replace("s", "")));
		}
		return inputList;
	}
}
