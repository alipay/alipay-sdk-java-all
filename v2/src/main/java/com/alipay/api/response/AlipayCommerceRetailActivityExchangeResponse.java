package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.activity.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 14:30:06
 */
public class AlipayCommerceRetailActivityExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6541494796421522669L;

	/** 
	 * 积分兑换结果，true为成功，false为失败
	 */
	@ApiField("status")
	private Boolean status;

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
