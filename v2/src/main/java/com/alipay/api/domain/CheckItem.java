package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查检验项目
 *
 * @author auto create
 * @since 1.0, 2026-09-14 14:13:01
 */
public class CheckItem extends AlipayObject {

	private static final long serialVersionUID = 6662671889446287161L;

	/**
	 * 执行科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 医生备注
	 */
	@ApiField("doctor_remark")
	private String doctorRemark;

	/**
	 * 院内目录返回商品ID，平台目录返回spuId
	 */
	@ApiField("id")
	private String id;

	/**
	 * 检查项目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 仅院内目录时返回
	 */
	@ApiField("notice")
	private String notice;

	/**
	 * 仅院内目录时返回
	 */
	@ApiField("purposes")
	private String purposes;

	/**
	 * HOSPITAL_LABORATORY：检验；
HOSPITAL_EXAMINATION：检查
	 */
	@ApiField("type")
	private String type;

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDoctorRemark() {
		return this.doctorRemark;
	}
	public void setDoctorRemark(String doctorRemark) {
		this.doctorRemark = doctorRemark;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNotice() {
		return this.notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getPurposes() {
		return this.purposes;
	}
	public void setPurposes(String purposes) {
		this.purposes = purposes;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
