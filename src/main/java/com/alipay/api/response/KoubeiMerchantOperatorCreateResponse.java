package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-05 17:47:25
 */
public class KoubeiMerchantOperatorCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2516771858259872556L;

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
