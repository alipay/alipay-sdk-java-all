package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditmerchant.productorder.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-02 11:06:57
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7386766366954693261L;

	/** 
	 * 业务成功标志
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 退订订单号
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 业务错误描述
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
