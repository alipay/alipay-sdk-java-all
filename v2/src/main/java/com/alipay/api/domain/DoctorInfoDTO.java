package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开单医生信息
 *
 * @author auto create
 * @since 1.0, 2026-09-14 14:13:01
 */
public class DoctorInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4387254272817292698L;

	/**
	 * 医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * base64 编码值，医生签名图片 base64 编码值和图片 URL 地址其中一个必须有值，任意返回其一
	 */
	@ApiField("doctor_signature")
	private String doctorSignature;

	/**
	 * 图片 URL 地址，医生签名图片 base64 编码值和图片 URL 地址其中一个必须有值，任意返回其一
	 */
	@ApiField("doctor_signature_url")
	private String doctorSignatureUrl;

	/**
	 * 角色描述
	 */
	@ApiField("role_desc")
	private String roleDesc;

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSignature() {
		return this.doctorSignature;
	}
	public void setDoctorSignature(String doctorSignature) {
		this.doctorSignature = doctorSignature;
	}

	public String getDoctorSignatureUrl() {
		return this.doctorSignatureUrl;
	}
	public void setDoctorSignatureUrl(String doctorSignatureUrl) {
		this.doctorSignatureUrl = doctorSignatureUrl;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

}
