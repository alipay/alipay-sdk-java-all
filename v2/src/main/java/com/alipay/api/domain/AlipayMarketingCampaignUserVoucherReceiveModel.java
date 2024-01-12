package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝商户券领取
 *
 * @author auto create
 * @since 1.0, 2021-05-28 17:20:51
 */
public class AlipayMarketingCampaignUserVoucherReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 7275378934414286834L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部业务号，是否传入由业务场景决定， 如果传入前缀需要带入ISV信息
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 场景码：默认(DEFAULT)
场景码与业务类型相关，接入时候请务必和支付宝技术对接人确认。需要传入特定业务场景的场景码
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<String> getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(List<String> sceneCode) {
		this.sceneCode = sceneCode;
	}

}
