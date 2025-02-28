package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupActivityDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-26 11:38:49
 */
public class AlipayMerchantGroupActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3498856675131718686L;

	/** 
	 * 商家群活动详情
	 */
	@ApiField("activity_detail")
	private GroupActivityDetailVO activityDetail;

	public void setActivityDetail(GroupActivityDetailVO activityDetail) {
		this.activityDetail = activityDetail;
	}
	public GroupActivityDetailVO getActivityDetail( ) {
		return this.activityDetail;
	}

}
