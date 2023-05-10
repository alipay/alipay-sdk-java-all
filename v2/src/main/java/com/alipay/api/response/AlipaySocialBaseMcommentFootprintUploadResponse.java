package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.footprint.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:41:55
 */
public class AlipaySocialBaseMcommentFootprintUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1592373641714665791L;

	/** 
	 * 结果码，100表示成功
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
