package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁直付通进件申请
 *
 * @author auto create
 * @since 1.0, 2025-09-22 14:16:37
 */
public class AlipayCircularZftIndirectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7419561153775366973L;

	/**
	 * 签约支付宝账户
	 */
	@ApiField("binding_alipay_logon_id")
	private String bindingAlipayLogonId;

	/**
	 * 商户联系人信息
	 */
	@ApiField("contact_info")
	private ZftContactInfo contactInfo;

	/**
	 * 默认结算账号
	 */
	@ApiField("default_settle_rule")
	private ZftDefaultSettleRule defaultSettleRule;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBindingAlipayLogonId() {
		return this.bindingAlipayLogonId;
	}
	public void setBindingAlipayLogonId(String bindingAlipayLogonId) {
		this.bindingAlipayLogonId = bindingAlipayLogonId;
	}

	public ZftContactInfo getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(ZftContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public ZftDefaultSettleRule getDefaultSettleRule() {
		return this.defaultSettleRule;
	}
	public void setDefaultSettleRule(ZftDefaultSettleRule defaultSettleRule) {
		this.defaultSettleRule = defaultSettleRule;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
