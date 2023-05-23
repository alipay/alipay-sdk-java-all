package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户油量信息
 *
 * @author auto create
 * @since 1.0, 2023-01-10 20:48:19
 */
public class AlipayInsAutoUserPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4187667121168655396L;

	/**
	 * 车险活动类型编码。
攒油活动：SAVE_OIL
	 */
	@ApiField("auto_campaign_type")
	private String autoCampaignType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAutoCampaignType() {
		return this.autoCampaignType;
	}
	public void setAutoCampaignType(String autoCampaignType) {
		this.autoCampaignType = autoCampaignType;
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
