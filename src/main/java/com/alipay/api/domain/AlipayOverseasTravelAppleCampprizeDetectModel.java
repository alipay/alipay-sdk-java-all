package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测苹果活动奖品可用状态
 *
 * @author auto create
 * @since 1.0, 2018-08-17 17:34:30
 */
public class AlipayOverseasTravelAppleCampprizeDetectModel extends AlipayObject {

	private static final long serialVersionUID = 6497415657375274977L;

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
