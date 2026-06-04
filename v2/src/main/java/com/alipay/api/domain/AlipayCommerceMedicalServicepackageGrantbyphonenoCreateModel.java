package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据手机号发放服务包
 *
 * @author auto create
 * @since 1.0, 2026-05-08 11:42:45
 */
public class AlipayCommerceMedicalServicepackageGrantbyphonenoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7357341145127883236L;

	/**
	 * 服务生效天数
	 */
	@ApiField("effect_days")
	private Long effectDays;

	/**
	 * 用户手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 项目ID
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
