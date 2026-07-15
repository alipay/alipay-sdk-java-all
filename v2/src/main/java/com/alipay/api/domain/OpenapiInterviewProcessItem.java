package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:49
 */
public class OpenapiInterviewProcessItem extends AlipayObject {

	private static final long serialVersionUID = 7135824573854244342L;

	/**
	 * AI面试流程编码
	 */
	@ApiField("ai_interview_code")
	private String aiInterviewCode;

	/**
	 * AI面试流程名称
	 */
	@ApiField("ai_interview_name")
	private String aiInterviewName;

	public String getAiInterviewCode() {
		return this.aiInterviewCode;
	}
	public void setAiInterviewCode(String aiInterviewCode) {
		this.aiInterviewCode = aiInterviewCode;
	}

	public String getAiInterviewName() {
		return this.aiInterviewName;
	}
	public void setAiInterviewName(String aiInterviewName) {
		this.aiInterviewName = aiInterviewName;
	}

}
