package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.data.feedbackurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 15:09:00
 */
public class ZhimaDataFeedbackurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7341555367255513418L;

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
