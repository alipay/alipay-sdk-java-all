package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园卡基本信息(简易版)
 *
 * @author auto create
 * @since 1.0, 2020-08-13 21:15:55
 */
public class SchoolCardSimpleInfo extends AlipayObject {

	private static final long serialVersionUID = 5687891724811415543L;

	/**
	 * 支付宝学校编码
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 学校标识码
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * isv分配的学生短码
	 */
	@ApiField("short_code")
	private String shortCode;

	/**
	 * 支付宝校园卡状态，0:有效，1:无效
	 */
	@ApiField("status")
	private String status;

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

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	public String getShortCode() {
		return this.shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
