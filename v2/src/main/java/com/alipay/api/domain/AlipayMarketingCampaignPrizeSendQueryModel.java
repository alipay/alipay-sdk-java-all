package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中奖信息查询
 *
 * @author auto create
 * @since 1.0, 2022-12-06 12:08:14
 */
public class AlipayMarketingCampaignPrizeSendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7356123588238431464L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
