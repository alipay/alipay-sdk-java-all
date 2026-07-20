package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.industry.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-17 17:57:51
 */
public class AlipayVoyagerIndustryOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7463175215188757953L;

	/** 
	 * 消费状态
	 */
	@ApiField("consume_status")
	private String consumeStatus;

	/** 
	 * 成功时为空，失败时返回平台错误码名称
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * true: 调用方应重试; false: 调用方不应重试
	 */
	@ApiField("need_retry")
	private Boolean needRetry;

	public void setConsumeStatus(String consumeStatus) {
		this.consumeStatus = consumeStatus;
	}
	public String getConsumeStatus( ) {
		return this.consumeStatus;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setNeedRetry(Boolean needRetry) {
		this.needRetry = needRetry;
	}
	public Boolean getNeedRetry( ) {
		return this.needRetry;
	}

}
