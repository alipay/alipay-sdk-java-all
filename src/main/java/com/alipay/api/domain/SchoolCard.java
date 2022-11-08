package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝校园卡信息
 *
 * @author auto create
 * @since 1.0, 2022-06-09 10:56:47
 */
public class SchoolCard extends AlipayObject {

	private static final long serialVersionUID = 6279896723544377473L;

	/**
	 * 学生姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 开通状态
	 */
	@ApiField("protocol_status")
	private String protocolStatus;

	/**
	 * 开通成功，返回的schema
	 */
	@ApiField("schema_url")
	private String schemaUrl;

	/**
	 * 学校内标，一般为2088开头的16位数字。支付宝分配，可直接咨询支付宝对接小二，也可通过开放平台接口查询
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 同学校分配给某学生的唯一标识，可以是学号、一卡通卡号等
	 */
	@ApiField("student_id")
	private String studentId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProtocolStatus() {
		return this.protocolStatus;
	}
	public void setProtocolStatus(String protocolStatus) {
		this.protocolStatus = protocolStatus;
	}

	public String getSchemaUrl() {
		return this.schemaUrl;
	}
	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
	}

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
