package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡包优惠券-使用规则
 *
 * @author auto create
 * @since 1.0, 2023-11-23 15:48:47
 */
public class VoucherRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 4748229478444889651L;

	/**
	 * 用户可通过该电话进行客服咨询
	 */
	@ApiField("customer_service_tel")
	private String customerServiceTel;

	/**
	 * 用户可通过进入该地址进行客服咨询
	 */
	@ApiField("customer_service_url")
	private String customerServiceUrl;

	/**
	 * 优惠券使用规则通用文案描述
	 */
	@ApiField("usage_rule_text")
	private String usageRuleText;

	/**
	 * 优惠券使用规则地址。用户点击「规则」直接调转到该地址对应的页面
	 */
	@ApiField("usage_rule_url")
	private String usageRuleUrl;

	public String getCustomerServiceTel() {
		return this.customerServiceTel;
	}
	public void setCustomerServiceTel(String customerServiceTel) {
		this.customerServiceTel = customerServiceTel;
	}

	public String getCustomerServiceUrl() {
		return this.customerServiceUrl;
	}
	public void setCustomerServiceUrl(String customerServiceUrl) {
		this.customerServiceUrl = customerServiceUrl;
	}

	public String getUsageRuleText() {
		return this.usageRuleText;
	}
	public void setUsageRuleText(String usageRuleText) {
		this.usageRuleText = usageRuleText;
	}

	public String getUsageRuleUrl() {
		return this.usageRuleUrl;
	}
	public void setUsageRuleUrl(String usageRuleUrl) {
		this.usageRuleUrl = usageRuleUrl;
	}

}
