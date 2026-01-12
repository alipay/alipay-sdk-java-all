package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告权益推进到白名单接口
 *
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:42
 */
public class AlipayCommerceRetailBenefitwhiteSetModel extends AlipayObject {

	private static final long serialVersionUID = 3443717363579553777L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 操作员信息
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * null
	 */
	@ApiListField("verify_tester_list")
	@ApiField("string")
	private List<String> verifyTesterList;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<String> getVerifyTesterList() {
		return this.verifyTesterList;
	}
	public void setVerifyTesterList(List<String> verifyTesterList) {
		this.verifyTesterList = verifyTesterList;
	}

}
