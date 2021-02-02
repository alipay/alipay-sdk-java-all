package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝商户券领取
 *
 * @author auto create
 * @since 1.0, 2021-01-25 11:45:18
 */
public class AlipayMarketingCampaignUserVoucherReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 5672749797667554772L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 场景码：默认(DEFAULT)
	 */
	@ApiListField("scene_code")
	@ApiField("string")
	private List<String> sceneCode;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List<String> getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(List<String> sceneCode) {
		this.sceneCode = sceneCode;
	}

}
