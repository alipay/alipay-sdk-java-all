package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.paysharingprod.familypay.sign response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:32
 */
public class AlipayPayAppPaysharingprodFamilypaySignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1854411228937653232L;

	/** 
	 * 签约授权单号，业务方可通过这个单号进行查询
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 授权地址，业务方重定向当前地址跳转支付宝内完成亲情卡签约
	 */
	@ApiField("auth_url")
	private String authUrl;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	public String getAuthUrl( ) {
		return this.authUrl;
	}

}
