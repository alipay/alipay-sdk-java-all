package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.zmcard.score.certify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-07 15:01:44
 */
public class ZhimaCustomerZmcardScoreCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1339762755789647433L;

	/** 
	 * 1.用户未开通芝麻返回ZM_ACCOUNT_NOT_EXISTED；2.用户未授权时会返回ZM_AUTH_NOT_EXIST；3.商户未开通芝麻证服务场景MERCHANT_ILLEGAL_AUTH_LEVEL；4.否则返回null。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 用户是否满足预先配置的芝麻分阈值
	 */
	@ApiField("certify_result")
	private Boolean certifyResult;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setCertifyResult(Boolean certifyResult) {
		this.certifyResult = certifyResult;
	}
	public Boolean getCertifyResult( ) {
		return this.certifyResult;
	}

}
