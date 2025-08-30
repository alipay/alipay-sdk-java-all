package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.resumeauthloginurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-27 20:17:36
 */
public class AlipayEbppIndustryJobResumeauthloginurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8819358447566746153L;

	/** 
	 * alipays://xxxxxx?appId=xxx&template_id=xxx&out_user_id=xxx&required_attributes=["xxx","xxx"]&source_app_id="请求来源appId"
	 */
	@ApiField("resume_auth_login_url")
	private String resumeAuthLoginUrl;

	public void setResumeAuthLoginUrl(String resumeAuthLoginUrl) {
		this.resumeAuthLoginUrl = resumeAuthLoginUrl;
	}
	public String getResumeAuthLoginUrl( ) {
		return this.resumeAuthLoginUrl;
	}

}
