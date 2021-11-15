package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户油量信息
 *
 * @author auto create
 * @since 1.0, 2017-09-28 11:02:54
 */
public class AlipayInsAutoUserPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8122649677933787825L;

	/**
	 * 车险活动类型编码。
攒油活动：SAVE_OIL
	 */
	@ApiField("auto_campaign_type")
	private String autoCampaignType;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
