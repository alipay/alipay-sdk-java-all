package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupActivityDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 15:30:24
 */
public class AlipayMerchantGroupActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7579299874392612258L;

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
