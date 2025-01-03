package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益模板展示信息
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:55
 */
public class BenefitTemplateDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 4453339452674973961L;

	/**
	 * 权益模板活动描述，由业务运营配置
	 */
	@ApiField("activity_desc")
	private String activityDesc;

	/**
	 * 权益模板活动名称，由业务运营配置
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 权益模板活动规则说明，由业务运营配置
	 */
	@ApiField("activity_rule_desc")
	private String activityRuleDesc;

	public String getActivityDesc() {
		return this.activityDesc;
	}
	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityRuleDesc() {
		return this.activityRuleDesc;
	}
	public void setActivityRuleDesc(String activityRuleDesc) {
		this.activityRuleDesc = activityRuleDesc;
	}

}
