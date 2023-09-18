package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.flashsales.stock.sync.update response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:48:26
 */
public class AlipayFlashsalesStockSyncUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2358556186928178536L;

	/** 
	 * 成功时返回的业务参数信息。
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 当更新库存不成功时，错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 成功标识
	 */
	@ApiField("success")
	private String success;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
