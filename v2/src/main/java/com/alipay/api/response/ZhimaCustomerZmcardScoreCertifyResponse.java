package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.zmcard.score.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 23:07:47
 */
public class ZhimaCustomerZmcardScoreCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6728967546618586793L;

	/** 
	 * 1.用户未开通芝麻返回ZM_ACCOUNT_NOT_EXISTED；2.用户未授权返回ZM_AUTH_NOT_EXIST；3.商户未开通芝麻证服务场景返回MERCHANT_ILLEGAL_AUTH_LEVEL；4. 完成准入判断返回SUCCESS；5. 查询出现异常返回 SYSTEM_FAILURE。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 用户芝麻分是否准入
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
