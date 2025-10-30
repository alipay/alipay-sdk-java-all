package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝商户自营销信息查询
 *
 * @author auto create
 * @since 1.0, 2025-05-12 19:36:08
 */
public class AlipayMarketingCampaignSelfActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8265665784143865234L;

	/**
	 * b.alipay.com 运营中心配置后台-活动详情-活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 是否需要券核销范围信息（包括pid列表、门店id列表和小程序appid列表，由于字段可能较大默认不返回，业务方也请慎用。pid列表:PID，门店id列表:SHOP_ID，小程序appid列表:APP_ID）
	 */
	@ApiListField("need_use_scope_info")
	@ApiField("string")
	private List<String> needUseScopeInfo;

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

	public List<String> getNeedUseScopeInfo() {
		return this.needUseScopeInfo;
	}
	public void setNeedUseScopeInfo(List<String> needUseScopeInfo) {
		this.needUseScopeInfo = needUseScopeInfo;
	}

	public List<String> getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(List<String> sceneCode) {
		this.sceneCode = sceneCode;
	}

}
