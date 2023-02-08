package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.rolerelation.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:43:34
 */
public class KoubeiMerchantOperatorRolerelationBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5282149276176563185L;

	/** 
	 * 操作是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
