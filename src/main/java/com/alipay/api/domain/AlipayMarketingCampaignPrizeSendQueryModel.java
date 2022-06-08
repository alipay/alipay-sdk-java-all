package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中奖信息查询
 *
 * @author auto create
 * @since 1.0, 2021-06-23 15:39:11
 */
public class AlipayMarketingCampaignPrizeSendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2831266248979539294L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
