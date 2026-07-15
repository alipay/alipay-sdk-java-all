package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:37:55
 */
public class SubUserInfo extends AlipayObject {

	private static final long serialVersionUID = 8483665657943796283L;

	/**
	 * null
	 */
	@ApiListField("service_item_restrict_rule_list")
	@ApiField("service_item_restrict_rule")
	private List<ServiceItemRestrictRule> serviceItemRestrictRuleList;

	/**
	 * 子订单开始时间
	 */
	@ApiField("sub_start_time")
	private Date subStartTime;

	/**
	 * 子使用人证件号
	 */
	@ApiField("sub_user_cert_no")
	private String subUserCertNo;

	/**
	 * 子使用人证件类型
	 */
	@ApiField("sub_user_cert_type")
	private String subUserCertType;

	/**
	 * 子使用人服务包订单生效天数
	 */
	@ApiField("sub_user_effect_days")
	private String subUserEffectDays;

	/**
	 * 子使用人姓名
	 */
	@ApiField("sub_user_name")
	private String subUserName;

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

	public Date getSubStartTime() {
		return this.subStartTime;
	}
	public void setSubStartTime(Date subStartTime) {
		this.subStartTime = subStartTime;
	}

	public String getSubUserCertNo() {
		return this.subUserCertNo;
	}
	public void setSubUserCertNo(String subUserCertNo) {
		this.subUserCertNo = subUserCertNo;
	}

	public String getSubUserCertType() {
		return this.subUserCertType;
	}
	public void setSubUserCertType(String subUserCertType) {
		this.subUserCertType = subUserCertType;
	}

	public String getSubUserEffectDays() {
		return this.subUserEffectDays;
	}
	public void setSubUserEffectDays(String subUserEffectDays) {
		this.subUserEffectDays = subUserEffectDays;
	}

	public String getSubUserName() {
		return this.subUserName;
	}
	public void setSubUserName(String subUserName) {
		this.subUserName = subUserName;
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
