package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefitscope.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:42
 */
public class AlipayCommerceRetailBenefitscopeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3558189978194617956L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * null
	 */
	@ApiListField("activity_scope_list")
	@ApiField("string")
	private List<String> activityScopeList;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityScopeList(List<String> activityScopeList) {
		this.activityScopeList = activityScopeList;
	}
	public List<String> getActivityScopeList( ) {
		return this.activityScopeList;
	}

}
