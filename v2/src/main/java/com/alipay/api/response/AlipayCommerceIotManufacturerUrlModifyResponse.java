package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.manufacturer.url.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-13 09:47:45
 */
public class AlipayCommerceIotManufacturerUrlModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1638882623639636794L;

	/** 
	 * 流水单号
	 */
	@ApiField("flow_no")
	private String flowNo;

	/** 
	 * 流水状态
	 */
	@ApiField("status")
	private String status;

	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}
	public String getFlowNo( ) {
		return this.flowNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
