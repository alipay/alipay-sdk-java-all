package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收信用取服务申请openapi
 *
 * @author auto create
 * @since 1.0, 2026-03-30 10:37:43
 */
public class AlipayCommerceRecycleCreditServiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5811195488199638352L;

	/**
	 * 商家绑定的支付宝登录账号
	 */
	@ApiField("binding_alipay_logon_id")
	private String bindingAlipayLogonId;

	/**
	 * 信用取分段规则
	 */
	@ApiField("rules")
	private String rules;

	/**
	 * 公私域场景标识
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 服务类目编码
	 */
	@ApiField("service_category")
	private String serviceCategory;

	/**
	 * 二级商户的账户信息
	 */
	@ApiField("submerchant")
	private String submerchant;

	public String getBindingAlipayLogonId() {
		return this.bindingAlipayLogonId;
	}
	public void setBindingAlipayLogonId(String bindingAlipayLogonId) {
		this.bindingAlipayLogonId = bindingAlipayLogonId;
	}

	public String getRules() {
		return this.rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getServiceCategory() {
		return this.serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public String getSubmerchant() {
		return this.submerchant;
	}
	public void setSubmerchant(String submerchant) {
		this.submerchant = submerchant;
	}

}
