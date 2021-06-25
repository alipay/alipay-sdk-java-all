package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学校
 *
 * @author auto create
 * @since 1.0, 2020-11-30 14:07:37
 */
public class TuitionISVSchoolDTO extends AlipayObject {

	private static final long serialVersionUID = 1685165145491193811L;

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
