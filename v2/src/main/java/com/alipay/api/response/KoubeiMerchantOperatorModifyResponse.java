package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:39
 */
public class KoubeiMerchantOperatorModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3594237478395664241L;

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
