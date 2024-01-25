package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户服务信息
 *
 * @author auto create
 * @since 1.0, 2023-10-17 18:02:50
 */
public class OpenApiUserServeInfo extends AlipayObject {

	private static final long serialVersionUID = 1397978239479925667L;

	/**
	 * 人员等级
	 */
	@ApiField("ability_grade")
	private String abilityGrade;

	/**
	 * 并发数
	 */
	@ApiField("service_capacity")
	private Long serviceCapacity;

	public String getAbilityGrade() {
		return this.abilityGrade;
	}
	public void setAbilityGrade(String abilityGrade) {
		this.abilityGrade = abilityGrade;
	}

	public Long getServiceCapacity() {
		return this.serviceCapacity;
	}
	public void setServiceCapacity(Long serviceCapacity) {
		this.serviceCapacity = serviceCapacity;
	}

}
