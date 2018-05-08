package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-23 14:56:56
 */
public class KoubeiMerchantOperatorCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2151879769767481853L;

	/** 
	 * 操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorId( ) {
		return this.operatorId;
	}

}
