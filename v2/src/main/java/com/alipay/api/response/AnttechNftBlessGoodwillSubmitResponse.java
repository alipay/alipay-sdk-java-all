package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.bless.goodwill.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-15 22:12:57
 */
public class AnttechNftBlessGoodwillSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3154641399448197979L;

	/** 
	 * 善念值实际发放个数
	 */
	@ApiField("actual_issue_value")
	private Long actualIssueValue;

	public void setActualIssueValue(Long actualIssueValue) {
		this.actualIssueValue = actualIssueValue;
	}
	public Long getActualIssueValue( ) {
		return this.actualIssueValue;
	}

}
