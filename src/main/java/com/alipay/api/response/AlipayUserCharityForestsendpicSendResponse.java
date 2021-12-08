package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.forestsendpic.send response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-21 10:03:39
 */
public class AlipayUserCharityForestsendpicSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8536397986496891497L;

	/** 
	 * 结果代码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果文案
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 是否上传成功
	 */
	@ApiField("success")
	private String success;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
