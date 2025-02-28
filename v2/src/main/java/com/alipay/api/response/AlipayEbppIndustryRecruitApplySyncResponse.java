package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.recruit.apply.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-17 17:52:22
 */
public class AlipayEbppIndustryRecruitApplySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7667143744841911465L;

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
