package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过手机号发放服务包
 *
 * @author auto create
 * @since 1.0, 2026-05-01 14:38:52
 */
public class AlipayCommerceMedicalServicepackageGrantbyphoneCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4272165944829398118L;

	/**
	 * 服务生效期限，单位天
	 */
	@ApiField("effect_days")
	private Long effectDays;

	/**
	 * 用户真实手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 项目真实ID，灵枢平台配置获取
	 */
	@ApiField("project_id")
	private String projectId;

	public Long getEffectDays() {
		return this.effectDays;
	}
	public void setEffectDays(Long effectDays) {
		this.effectDays = effectDays;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
