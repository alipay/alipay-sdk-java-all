package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 春暖花开优惠券查询服务
 *
 * @author auto create
 * @since 1.0, 2020-04-02 17:04:43
 */
public class AlipayMarketingCampaignWarmcardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3323984143137619771L;

	/**
	 * 春暖花开活动场景码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
