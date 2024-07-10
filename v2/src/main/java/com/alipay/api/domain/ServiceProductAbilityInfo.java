package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务可提供能力
 *
 * @author auto create
 * @since 1.0, 2023-03-09 18:03:18
 */
public class ServiceProductAbilityInfo extends AlipayObject {

	private static final long serialVersionUID = 8896615457935727368L;

	/**
	 * 服务能力id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 服务能力
	 */
	@ApiField("service_ability")
	private String serviceAbility;

	/**
	 * 服务能力名字
	 */
	@ApiField("service_ability_name")
	private String serviceAbilityName;

	/**
	 * 服务产品id
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getServiceAbility() {
		return this.serviceAbility;
	}
	public void setServiceAbility(String serviceAbility) {
		this.serviceAbility = serviceAbility;
	}

	public String getServiceAbilityName() {
		return this.serviceAbilityName;
	}
	public void setServiceAbilityName(String serviceAbilityName) {
		this.serviceAbilityName = serviceAbilityName;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
