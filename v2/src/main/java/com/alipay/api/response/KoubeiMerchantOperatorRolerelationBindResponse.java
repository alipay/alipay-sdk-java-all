package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.rolerelation.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:10:00
 */
public class KoubeiMerchantOperatorRolerelationBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8271444527418952275L;

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
