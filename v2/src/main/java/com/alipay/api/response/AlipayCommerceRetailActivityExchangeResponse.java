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

	private static final long serialVersionUID = 4687793452924997165L;

	/** 
	 * 积分兑换状态
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
