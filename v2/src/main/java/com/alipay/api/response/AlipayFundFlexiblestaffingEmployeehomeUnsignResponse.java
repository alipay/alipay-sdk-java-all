package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.employeehome.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:41
 */
public class AlipayFundFlexiblestaffingEmployeehomeUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8814319549387356287L;

	/** 
	 * 解除的服务id
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 解除服务后的状态：
INVALID  失效
	 */
	@ApiField("status")
	private String status;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
