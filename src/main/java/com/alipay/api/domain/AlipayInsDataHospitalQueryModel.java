package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险知识图谱-医院模糊查询
 *
 * @author auto create
 * @since 1.0, 2019-10-11 14:40:23
 */
public class AlipayInsDataHospitalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1176148164326259488L;

	/**
	 * 医院所在的地市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
