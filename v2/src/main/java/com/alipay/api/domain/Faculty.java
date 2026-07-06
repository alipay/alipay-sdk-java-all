package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专业方向
 *
 * @author auto create
 * @since 1.0, 2026-03-18 11:46:45
 */
public class Faculty extends AlipayObject {

	private static final long serialVersionUID = 7439826521983983286L;

	/**
	 * 专业方向ID
	 */
	@ApiField("faculty_id")
	private String facultyId;

	/**
	 * 专业方向名称
	 */
	@ApiField("faculty_name")
	private String facultyName;

	public String getFacultyId() {
		return this.facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return this.facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

}
