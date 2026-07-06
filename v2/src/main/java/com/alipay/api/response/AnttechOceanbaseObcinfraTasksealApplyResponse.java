package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obcinfra.taskseal.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-18 17:40:23
 */
public class AnttechOceanbaseObcinfraTasksealApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3552731749153214178L;

	/** 
	 * 用印流水id
	 */
	@ApiField("seal_request_id")
	private String sealRequestId;

	public void setSealRequestId(String sealRequestId) {
		this.sealRequestId = sealRequestId;
	}
	public String getSealRequestId( ) {
		return this.sealRequestId;
	}

}
