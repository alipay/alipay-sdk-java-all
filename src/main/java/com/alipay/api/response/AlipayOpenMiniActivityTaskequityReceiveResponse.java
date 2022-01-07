package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.activity.taskequity.receive response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-28 17:01:29
 */
public class AlipayOpenMiniActivityTaskequityReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4557196294272519745L;

	/** 
	 * 状态码，返回SUCCESS时表示正常，其他值时表示异常情况
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 状态信息，正常时为"成功"，异常情况时表示相应的错误信息
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * biz_code不为SUCCESS时，是否可短期内重试
	 */
	@ApiField("retryable")
	private Boolean retryable;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setRetryable(Boolean retryable) {
		this.retryable = retryable;
	}
	public Boolean getRetryable( ) {
		return this.retryable;
	}

}
