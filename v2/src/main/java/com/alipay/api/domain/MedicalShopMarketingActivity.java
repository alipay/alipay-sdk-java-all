package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店营销活动
 *
 * @author auto create
 * @since 1.0, 2024-06-12 16:03:03
 */
public class MedicalShopMarketingActivity extends AlipayObject {

	private static final long serialVersionUID = 3474811487682741174L;

	/**
	 * 营销活动阶梯规则
	 */
	@ApiListField("activity_rule")
	@ApiField("medical_shop_marketing_activity_rule")
	private List<MedicalShopMarketingActivityRule> activityRule;

	/**
	 * 营销活动类型：1-配送满减活动
	 */
	@ApiField("activity_type")
	private Long activityType;

	/**
	 * 活动结束时间，1.精确到分钟，格式为HH:MM
2.不允许跨天，开始时间须小于结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public List<MedicalShopMarketingActivityRule> getActivityRule() {
		return this.activityRule;
	}
	public void setActivityRule(List<MedicalShopMarketingActivityRule> activityRule) {
		this.activityRule = activityRule;
	}

	public Long getActivityType() {
		return this.activityType;
	}
	public void setActivityType(Long activityType) {
		this.activityType = activityType;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
