package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-17 16:38:28
 */
public class KoubeiMerchantOperatorModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2883762641352577141L;

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
