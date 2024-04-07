package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园码信息
 *
 * @author auto create
 * @since 1.0, 2020-01-09 17:56:03
 */
public class HSchoolInfo extends AlipayObject {

	private static final long serialVersionUID = 6766921945734361334L;

	/**
	 * 学号
	 */
	@ApiField("campus_no")
	private String campusNo;

	/**
	 * 学校外标
	 */
	@ApiField("school_std_code")
	private String schoolStdCode;

	public String getCampusNo() {
		return this.campusNo;
	}
	public void setCampusNo(String campusNo) {
		this.campusNo = campusNo;
	}

	public String getSchoolStdCode() {
		return this.schoolStdCode;
	}
	public void setSchoolStdCode(String schoolStdCode) {
		this.schoolStdCode = schoolStdCode;
	}

}
