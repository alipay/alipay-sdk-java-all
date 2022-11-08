package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExperimentInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apeexperiment.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-06 20:01:57
 */
public class AlipayDigitalopUcdpApeexperimentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4315161295342618773L;

	/** 
	 * 实验信息，包含对照组和算法组的数据
	 */
	@ApiListField("experiment_info_list")
	@ApiField("experiment_info")
	private List<ExperimentInfo> experimentInfoList;

	/** 
	 * 当前正在运行的实验id，为空说明没有实验正在运行
	 */
	@ApiField("running_experiment_id")
	private String runningExperimentId;

	public void setExperimentInfoList(List<ExperimentInfo> experimentInfoList) {
		this.experimentInfoList = experimentInfoList;
	}
	public List<ExperimentInfo> getExperimentInfoList( ) {
		return this.experimentInfoList;
	}

	public void setRunningExperimentId(String runningExperimentId) {
		this.runningExperimentId = runningExperimentId;
	}
	public String getRunningExperimentId( ) {
		return this.runningExperimentId;
	}

}
