package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.house.process.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-08 11:52:56
 */
public class AlipayCommerceRentHouseProcessSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2371845588232194596L;

	/** 
	 * 过程记录ID，全局唯一
	 */
	@ApiField("process_id")
	private String processId;

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

}
