package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-20 10:15:04
 */
public class SubUserInfo extends AlipayObject {

	private static final long serialVersionUID = 6672624515576394784L;

	/**
	 * null
	 */
	@ApiListField("service_item_restrict_rule_list")
	@ApiField("service_item_restrict_rule")
	private List<ServiceItemRestrictRule> serviceItemRestrictRuleList;

	/**
	 * 子使用人服务包订单生效天数
	 */
	@ApiField("sub_user_effect_days")
	private String subUserEffectDays;

	/**
	 * 子使用人手机号
	 */
	@ApiField("sub_user_phone_no")
	private String subUserPhoneNo;

	/**
	 * 子使用人服务包订单可用开始时间
	 */
	@ApiField("sub_user_start_time")
	private String subUserStartTime;

	public List<ServiceItemRestrictRule> getServiceItemRestrictRuleList() {
		return this.serviceItemRestrictRuleList;
	}
	public void setServiceItemRestrictRuleList(List<ServiceItemRestrictRule> serviceItemRestrictRuleList) {
		this.serviceItemRestrictRuleList = serviceItemRestrictRuleList;
	}

	public String getSubUserEffectDays() {
		return this.subUserEffectDays;
	}
	public void setSubUserEffectDays(String subUserEffectDays) {
		this.subUserEffectDays = subUserEffectDays;
	}

	public String getSubUserPhoneNo() {
		return this.subUserPhoneNo;
	}
	public void setSubUserPhoneNo(String subUserPhoneNo) {
		this.subUserPhoneNo = subUserPhoneNo;
	}

	public String getSubUserStartTime() {
		return this.subUserStartTime;
	}
	public void setSubUserStartTime(String subUserStartTime) {
		this.subUserStartTime = subUserStartTime;
	}

}
