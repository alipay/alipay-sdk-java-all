package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.data.feedbackurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-18 14:12:24
 */
public class ZhimaDataFeedbackurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1293484725935912681L;

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
