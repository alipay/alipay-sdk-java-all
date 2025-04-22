package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转诊信息同步
 *
 * @author auto create
 * @since 1.0, 2025-04-14 15:32:57
 */
public class AlipayCommerceMedicalIndustrydataInquiryinfochangeUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5298521324298546465L;

	/**
	 * 支付宝医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 外部自己医生的唯一标识
	 */
	@ApiField("ext_doctor_id")
	private String extDoctorId;

	/**
	 * 支付宝问诊单ID
	 */
	@ApiField("inquiry_id")
	private String inquiryId;

	/**
	 * 平台编码号
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 转诊原因:用于记录转诊原因
	 */
	@ApiField("reason")
	private String reason;

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

	public String getExtDoctorId() {
		return this.extDoctorId;
	}
	public void setExtDoctorId(String extDoctorId) {
		this.extDoctorId = extDoctorId;
	}

	public String getInquiryId() {
		return this.inquiryId;
	}
	public void setInquiryId(String inquiryId) {
		this.inquiryId = inquiryId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
