package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝用户苹果绑定状态
 *
 * @author auto create
 * @since 1.0, 2020-08-17 14:01:12
 */
public class AlipayMarketingCampaignAppleActivityConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3774294958478291711L;

	/**
	 * 活动id
活动的唯一标识
接口人根据具体活动分配
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 扩展字段
活动扩展字段
调用方根据不同活动传递
	 */
	@ApiField("extra")
	private String extra;

	/**
	 * 调用方平台用户ID
记录平台用户ID和支付宝ID对应关系
调用方平台提供
	 */
	@ApiField("out_biz_value")
	private String outBizValue;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getExtra() {
		return this.extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getOutBizValue() {
		return this.outBizValue;
	}
	public void setOutBizValue(String outBizValue) {
		this.outBizValue = outBizValue;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
