package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditmerchant.productorder.delay response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-01 09:45:19
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderDelayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4862129819516119137L;

	/** 
	 * 业务成功标志
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 订单编号
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 业务错误信息
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
