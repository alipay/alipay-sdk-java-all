package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-13 20:43:32
 */
public class KoubeiMerchantOperatorCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6659239385861567647L;

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
