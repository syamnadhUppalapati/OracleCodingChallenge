package com.oracle.service;

import java.util.List;

import com.oracle.entity.ProjectInfoEntity;

public interface GetInfoService {
	void getRequiredInfo(List<ProjectInfoEntity> inputList);
}
