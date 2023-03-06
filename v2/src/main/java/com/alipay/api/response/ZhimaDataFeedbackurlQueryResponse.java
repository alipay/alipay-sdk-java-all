package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.data.feedbackurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 19:18:56
 */
public class ZhimaDataFeedbackurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7418916348168729618L;

	/** 
	 * 反馈模板地址
	 */
	@ApiField("feedback_url")
	private String feedbackUrl;

	public void setFeedbackUrl(String feedbackUrl) {
		this.feedbackUrl = feedbackUrl;
	}
	public String getFeedbackUrl( ) {
		return this.feedbackUrl;
	}

}
