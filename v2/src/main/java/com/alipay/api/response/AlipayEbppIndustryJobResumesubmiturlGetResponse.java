package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.resumesubmiturl.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-11 14:47:36
 */
public class AlipayEbppIndustryJobResumesubmiturlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6822877316776149646L;

	/** 
	 * 岗位投递url   （前端跳转链接）
格式为
alipays://xxxxxx?appId=xxx&template_id=xxx&job_id=xxx&required_attributes=["xxx","xxx"]&optional_attributes=["xxx","xxx"]&return_rule&source_appId="请求来源appId"
	 */
	@ApiField("resume_submit_url")
	private String resumeSubmitUrl;

	public void setResumeSubmitUrl(String resumeSubmitUrl) {
		this.resumeSubmitUrl = resumeSubmitUrl;
	}
	public String getResumeSubmitUrl( ) {
		return this.resumeSubmitUrl;
	}

}
