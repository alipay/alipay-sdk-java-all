package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝商户券领取咨询
 *
 * @author auto create
 * @since 1.0, 2021-05-28 17:18:50
 */
public class AlipayMarketingCampaignUserVoucherConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4417455444497234542L;

	/**
	 * 活动id列表
	 */
	@ApiListField("activity_id_list")
	@ApiField("string")
	private List<String> activityIdList;

	/**
	 * 场景码：默认(DEFAULT)
	 */
	@ApiListField("scene_code")
	@ApiField("string")
	private List<String> sceneCode;

	public List<String> getActivityIdList() {
		return this.activityIdList;
	}
	public void setActivityIdList(List<String> activityIdList) {
		this.activityIdList = activityIdList;
	}

	public List<String> getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(List<String> sceneCode) {
		this.sceneCode = sceneCode;
	}

}
