package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云陪诊医院扁鹊配置同步配置类
 *
 * @author auto create
 * @since 1.0, 2026-06-23 13:38:31
 */
public class HospitalConfigItem extends AlipayObject {

	private static final long serialVersionUID = 2146528152333317642L;

	/**
	 * 参数值
	 */
	@ApiField("code")
	private String code;

	/**
	 * 灰度配置，取值为true/false，没有则不填
	 */
	@ApiField("gray_config")
	private Boolean grayConfig;

	/**
	 * 院区编码
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 医院机构编码
	 */
	@ApiField("org_id")
	private String orgId;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getGrayConfig() {
		return this.grayConfig;
	}
	public void setGrayConfig(Boolean grayConfig) {
		this.grayConfig = grayConfig;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

}
