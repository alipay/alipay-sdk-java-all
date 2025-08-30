package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.classification.category.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:00
 */
public class AlipayIserviceCognitiveClassificationCategorySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2548491676771416132L;

	/** 
	 * 错误code
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 错误描述
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 是否正确
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
