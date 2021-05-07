package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-06 14:58:22
 */
public class KoubeiMerchantOperatorModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4441518159198363348L;

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
