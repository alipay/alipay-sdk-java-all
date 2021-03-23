package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝商户自营销信息查询
 *
 * @author auto create
 * @since 1.0, 2021-03-22 15:16:38
 */
public class AlipayMarketingCampaignSelfActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6513897357311271856L;

	/**
	 * b.alipay.com 运营中心配置后台-活动详情-活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 场景码：默认(DEFAULT)
场景码与业务类型相关，接入时候请务必和支付宝技术对接人确认，需要传入特定业务场景的场景码
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
