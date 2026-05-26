package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefit.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-24 22:57:43
 */
public class AlipayCommerceRetailBenefitSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4483274369792479256L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 副本审核id
	 */
	@ApiField("copy_edit_id")
	private String copyEditId;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setCopyEditId(String copyEditId) {
		this.copyEditId = copyEditId;
	}
	public String getCopyEditId( ) {
		return this.copyEditId;
	}

}
