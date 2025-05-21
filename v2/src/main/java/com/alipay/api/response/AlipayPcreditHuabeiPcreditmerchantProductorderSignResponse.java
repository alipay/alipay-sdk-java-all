package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditmerchant.productorder.sign response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-02 11:07:52
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 6557414739753134731L;

	/** 
	 * 业务是否成功字段
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 订购单号
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 业务错误细腻
	 */
	@ApiField("error_message")
	private String errorMessage;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

}
