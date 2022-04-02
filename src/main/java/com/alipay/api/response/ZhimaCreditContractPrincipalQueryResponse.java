package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.contract.principal.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-30 14:34:55
 */
public class ZhimaCreditContractPrincipalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6899138182618186383L;

	/** 
	 * 是否需要授权。仅当mode=1时需要进行处理，此时用户需要手动在手机上完成授权操作，商户可在机具上给出相关提示，如：请在手机上确认。
	 */
	@ApiField("need_auth")
	private String needAuth;

	/** 
	 * 扫码模式下返回的url。此时需要商户将该url转换为二维码，用户用支付宝扫码即可进行接下来的业务流程。
	 */
	@ApiField("url")
	private String url;

	public void setNeedAuth(String needAuth) {
		this.needAuth = needAuth;
	}
	public String getNeedAuth( ) {
		return this.needAuth;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
