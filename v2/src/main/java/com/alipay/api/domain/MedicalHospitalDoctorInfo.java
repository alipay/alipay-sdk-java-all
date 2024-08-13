package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class MedicalHospitalDoctorInfo extends AlipayObject {

	private static final long serialVersionUID = 7427642248682749161L;

	/**
	 * 医生唯一标识，编码开发者生成并保证唯一
	 */
	@ApiField("code")
	private String code;

	/**
	 * 医生名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 性别
女性：F
男性：M
未知：U
	 */
	@ApiField("sex")
	private String sex;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
