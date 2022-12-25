package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.logisticsinstock.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:06:08
 */
public class KoubeiSalesKbassetStuffLogisticsinstockSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6153111761999613318L;

	/** 
	 * 报错编码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 报错描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/** 
	 * 本次调用的requestId
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 调用是否成功（true/false）
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public String getErrorDesc( ) {
		return this.errorDesc;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
