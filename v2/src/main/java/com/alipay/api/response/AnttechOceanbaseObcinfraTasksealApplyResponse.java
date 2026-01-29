package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obcinfra.taskseal.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-11 14:07:42
 */
public class AnttechOceanbaseObcinfraTasksealApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3396766433197221562L;

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
