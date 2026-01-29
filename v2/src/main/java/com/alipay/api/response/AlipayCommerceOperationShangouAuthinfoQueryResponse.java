package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.shangou.authinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-12 16:42:42
 */
public class AlipayCommerceOperationShangouAuthinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3618936354332498632L;

	/** 
	 * 手机号绑定状态
	 */
	@ApiField("mobile_binding_status")
	private String mobileBindingStatus;

	public void setMobileBindingStatus(String mobileBindingStatus) {
		this.mobileBindingStatus = mobileBindingStatus;
	}
	public String getMobileBindingStatus( ) {
		return this.mobileBindingStatus;
	}

}
