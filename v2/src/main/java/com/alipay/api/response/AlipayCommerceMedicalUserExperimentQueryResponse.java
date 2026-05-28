package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExperimentDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.user.experiment.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 14:02:48
 */
public class AlipayCommerceMedicalUserExperimentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1644783691829533949L;

	/** 
	 * 实验信息
	 */
	@ApiField("experiment_detail")
	private ExperimentDetail experimentDetail;

	public void setExperimentDetail(ExperimentDetail experimentDetail) {
		this.experimentDetail = experimentDetail;
	}
	public ExperimentDetail getExperimentDetail( ) {
		return this.experimentDetail;
	}

}
