package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.activity.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-05 16:42:20
 */
public class AlipayCommerceRetailActivityExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4178843738713843963L;

	/** 
	 * 积分兑换状态
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
