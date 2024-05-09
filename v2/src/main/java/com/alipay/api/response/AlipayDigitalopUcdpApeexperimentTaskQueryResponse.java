package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apeexperiment.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:53:35
 */
public class AlipayDigitalopUcdpApeexperimentTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3116194814991122722L;

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
