package com.oracle.consumer;

import java.util.List;

import com.oracle.entity.ProjectInfoEntity;

public interface MainConsumerInterface {
	void processProjectInfo(List<ProjectInfoEntity> inputList);
}
