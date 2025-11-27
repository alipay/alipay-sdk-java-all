package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.discount.solution.online response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:37:36
 */
public class AlipayPcreditHuabeiDiscountSolutionOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 6562814944998743263L;

	/** 
	 * 贴息方案实例id
	 */
	@ApiField("solution_id")
	private String solutionId;

	/** 
	 * 贴息方案是否生效，true生效，false没有生效
	 */
	@ApiField("success")
	private Boolean success;

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionId( ) {
		return this.solutionId;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
