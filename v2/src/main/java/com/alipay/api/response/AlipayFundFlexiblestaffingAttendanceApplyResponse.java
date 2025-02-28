package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.attendance.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 10:30:50
 */
public class AlipayFundFlexiblestaffingAttendanceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6838164348148144458L;

	/** 
	 * 考勤跳转链接
	 */
	@ApiField("apply_link")
	private String applyLink;

	/** 
	 * token
	 */
	@ApiField("flow_token")
	private String flowToken;

	public void setApplyLink(String applyLink) {
		this.applyLink = applyLink;
	}
	public String getApplyLink( ) {
		return this.applyLink;
	}

	public void setFlowToken(String flowToken) {
		this.flowToken = flowToken;
	}
	public String getFlowToken( ) {
		return this.flowToken;
	}

}
