package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.sirius.apply.callback response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-11 10:34:04
 */
public class ZhimaCreditEpSiriusApplyCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 5488838849431896238L;

	/** 
	 * 天狼星业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 响应消息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 响应码
	 */
	@ApiField("resp_code")
	private Long respCode;

	/** 
	 * 用户标志，该值可能随机生成，不一定是UID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setRespCode(Long respCode) {
		this.respCode = respCode;
	}
	public Long getRespCode( ) {
		return this.respCode;
	}

	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}
	public String getSiteUserId( ) {
		return this.siteUserId;
	}

}
