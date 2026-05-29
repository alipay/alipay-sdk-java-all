package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医院信息
 *
 * @author auto create
 * @since 1.0, 2026-04-16 17:47:45
 */
public class SimpleHospitalInfo extends AlipayObject {

	private static final long serialVersionUID = 7649667764218756183L;

	/**
	 * String	好大夫医院id
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

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

}
