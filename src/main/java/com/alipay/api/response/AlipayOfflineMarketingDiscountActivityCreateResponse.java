package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.discount.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineMarketingDiscountActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1538246218756517388L;

	/** 
	 * 活动编号
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 奖品id列表
	 */
	@ApiListField("prize_ids")
	@ApiField("string")
	private List<String> prizeIds;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setPrizeIds(List<String> prizeIds) {
		this.prizeIds = prizeIds;
	}
	public List<String> getPrizeIds( ) {
		return this.prizeIds;
	}

}
