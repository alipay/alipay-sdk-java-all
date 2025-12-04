package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标准医院信息医院信息
 *
 * @author auto create
 * @since 1.0, 2020-11-25 14:38:51
 */
public class HospitalDTO extends AlipayObject {

	private static final long serialVersionUID = 3838353229366393281L;

	/**
	 * 医院ID
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 医院标准名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 医院等级，一级医院、二级医院、三级医院、其他
	 */
	@ApiField("level")
	private String level;

	/**
	 * 医院性质：公立医院、私立医院、其他
	 */
	@ApiField("ownership")
	private String ownership;

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getOwnership() {
		return this.ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

}
