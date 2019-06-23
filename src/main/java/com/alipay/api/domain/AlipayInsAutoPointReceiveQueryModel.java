package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户攒油试算
 *
 * @author auto create
 * @since 1.0, 2017-09-28 11:03:00
 */
public class AlipayInsAutoPointReceiveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2364225456736225574L;

	/**
	 * 车险活动类型编码。
攒油活动：SAVE_OIL
	 */
	@ApiField("auto_campaign_type")
	private String autoCampaignType;

	/**
	 * 车险活动接入场景码。
例如，车险攒油活动接入场景码。
高德导航：gaode_use
	 */
	@ApiField("scene_type")
	private String sceneType;

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

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
