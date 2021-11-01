package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学校
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:53:13
 */
public class TuitionISVSchoolDTO extends AlipayObject {

	private static final long serialVersionUID = 5594357948773415237L;

	/**
	 * 2位国家码
	 */
	@ApiField("country")
	private String country;

	/**
	 * 学校id
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
