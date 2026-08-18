package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.house.process.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-17 15:12:49
 */
public class AlipayCommerceRentHouseProcessSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4721484362993978454L;

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
