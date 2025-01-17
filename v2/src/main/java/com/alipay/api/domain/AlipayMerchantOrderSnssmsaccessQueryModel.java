package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人传人短信准入查询
 *
 * @author auto create
 * @since 1.0, 2024-10-31 20:52:11
 */
public class AlipayMerchantOrderSnssmsaccessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5644754946691873837L;

	/**
	 * 接口提供给服务商调用，相关接口调用时会通知服务商方调用活动编码，会服务商咨询活动配置人员。且活动编码属于动态变化，不能用枚举列举。
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 决策扩展信息
	 */
	@ApiField("decision_ext_info")
	private DecisionExtInfo decisionExtInfo;

	/**
	 * 人传人用户信息
	 */
	@ApiField("user_access_info")
	private UserAccessInfo userAccessInfo;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public DecisionExtInfo getDecisionExtInfo() {
		return this.decisionExtInfo;
	}
	public void setDecisionExtInfo(DecisionExtInfo decisionExtInfo) {
		this.decisionExtInfo = decisionExtInfo;
	}

	public UserAccessInfo getUserAccessInfo() {
		return this.userAccessInfo;
	}
	public void setUserAccessInfo(UserAccessInfo userAccessInfo) {
		this.userAccessInfo = userAccessInfo;
	}

}
