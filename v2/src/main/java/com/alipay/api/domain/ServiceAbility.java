package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码服务能力模型
 *
 * @author auto create
 * @since 1.0, 2023-03-15 17:29:43
 */
public class ServiceAbility extends AlipayObject {

	private static final long serialVersionUID = 5744846143328248957L;

	/**
	 * 服务能力名称
	 */
	@ApiField("service_ability_key")
	private String serviceAbilityKey;

	/**
	 * 服务能力配置值
	 */
	@ApiField("service_ability_value")
	private String serviceAbilityValue;

	public String getServiceAbilityKey() {
		return this.serviceAbilityKey;
	}
	public void setServiceAbilityKey(String serviceAbilityKey) {
		this.serviceAbilityKey = serviceAbilityKey;
	}

	public String getServiceAbilityValue() {
		return this.serviceAbilityValue;
	}
	public void setServiceAbilityValue(String serviceAbilityValue) {
		this.serviceAbilityValue = serviceAbilityValue;
	}

}
