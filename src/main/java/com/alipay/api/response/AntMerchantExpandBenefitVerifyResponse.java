package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.benefit.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-23 20:51:41
 */
public class AntMerchantExpandBenefitVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4537138186141932974L;

	/** 
	 * 扩展的业务信息
	 */
	@ApiField("biz_ext")
	private String bizExt;

	/** 
	 * 错误信息
	 */
	@ApiField("detail_msg")
	private String detailMsg;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 核销结果 true/false
	 */
	@ApiField("result")
	private String result;

	public void setBizExt(String bizExt) {
		this.bizExt = bizExt;
	}
	public String getBizExt( ) {
		return this.bizExt;
	}

	public void setDetailMsg(String detailMsg) {
		this.detailMsg = detailMsg;
	}
	public String getDetailMsg( ) {
		return this.detailMsg;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
