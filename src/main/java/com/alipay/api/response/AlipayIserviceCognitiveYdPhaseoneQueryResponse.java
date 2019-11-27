package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.yd.phaseone.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-23 19:34:56
 */
public class AlipayIserviceCognitiveYdPhaseoneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4679257619368912514L;

	/** 
	 * 错误代码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 返回数据
	 */
	@ApiField("value")
	private String value;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public String getValue( ) {
		return this.value;
	}

}
