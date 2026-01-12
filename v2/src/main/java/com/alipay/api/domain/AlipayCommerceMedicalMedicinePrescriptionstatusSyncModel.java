package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开方购药处方状态同步
 *
 * @author auto create
 * @since 1.0, 2025-04-17 15:43:58
 */
public class AlipayCommerceMedicalMedicinePrescriptionstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8264279842191366119L;

	/**
	 * 审核药师手写签名url
	 */
	@ApiField("checker_hand_signature_url")
	private String checkerHandSignatureUrl;

	/**
	 * 审核药师名称
	 */
	@ApiField("checker_name")
	private String checkerName;

	/**
	 * 外部的处方号
	 */
	@ApiField("ext_prescription_code")
	private String extPrescriptionCode;

	/**
	 * 支付宝问诊订单编号
	 */
	@ApiField("inquiry_id")
	private String inquiryId;

	/**
	 * 支付宝为每个对接方分配的平台号
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 处方状态
	 */
	@ApiField("prescription_status")
	private String prescriptionStatus;

	/**
	 * 状态变更原因
	 */
	@ApiField("reason")
	private String reason;

	public String getCheckerHandSignatureUrl() {
		return this.checkerHandSignatureUrl;
	}
	public void setCheckerHandSignatureUrl(String checkerHandSignatureUrl) {
		this.checkerHandSignatureUrl = checkerHandSignatureUrl;
	}

	public String getCheckerName() {
		return this.checkerName;
	}
	public void setCheckerName(String checkerName) {
		this.checkerName = checkerName;
	}

	public String getExtPrescriptionCode() {
		return this.extPrescriptionCode;
	}
	public void setExtPrescriptionCode(String extPrescriptionCode) {
		this.extPrescriptionCode = extPrescriptionCode;
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

	public String getPrescriptionStatus() {
		return this.prescriptionStatus;
	}
	public void setPrescriptionStatus(String prescriptionStatus) {
		this.prescriptionStatus = prescriptionStatus;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
