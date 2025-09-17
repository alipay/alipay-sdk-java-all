package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.recruit.apply.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-11 16:52:28
 */
public class AlipayEbppIndustryRecruitApplySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6159194796839749457L;

	/** 
	 * 支付宝就业频道应聘id
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 快招报名ID
	 */
	@ApiField("recruit_apply_id")
	private String recruitApplyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setRecruitApplyId(String recruitApplyId) {
		this.recruitApplyId = recruitApplyId;
	}
	public String getRecruitApplyId( ) {
		return this.recruitApplyId;
	}

}
