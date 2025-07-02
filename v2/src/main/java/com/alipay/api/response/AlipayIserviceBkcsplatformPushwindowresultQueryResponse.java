package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.bkcsplatform.pushwindowresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:31:42
 */
public class AlipayIserviceBkcsplatformPushwindowresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2313119185362437742L;

	/** 
	 * 用户输入的验证码
	 */
	@ApiField("feedback_values")
	private String feedbackValues;

	/** 
	 * 方舟工作台服务号
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 推屏唯一code
	 */
	@ApiField("request_token")
	private String requestToken;

	public void setFeedbackValues(String feedbackValues) {
		this.feedbackValues = feedbackValues;
	}
	public String getFeedbackValues( ) {
		return this.feedbackValues;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}
	public String getRequestToken( ) {
		return this.requestToken;
	}

}
