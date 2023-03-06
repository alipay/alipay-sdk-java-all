package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apeexperiment.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 01:17:12
 */
public class AlipayDigitalopUcdpApeexperimentTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6232142247266164375L;

	/** 
	 * 任务状态，success（成功）、fail（失败）、processing（处理中）
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
