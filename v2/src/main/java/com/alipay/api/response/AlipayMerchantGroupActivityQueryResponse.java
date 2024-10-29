package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupActivityDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-13 11:27:08
 */
public class AlipayMerchantGroupActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6522952659173588354L;

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
