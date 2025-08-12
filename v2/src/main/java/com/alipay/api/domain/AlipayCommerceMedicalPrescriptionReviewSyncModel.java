package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个处方药师审核结果同步
 *
 * @author auto create
 * @since 1.0, 2025-05-14 18:32:37
 */
public class AlipayCommerceMedicalPrescriptionReviewSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4431148777449486113L;

	/**
	 * 如果该处方单由合作方自有药师审核，则将合作方的药师编码传入
	 */
	@ApiField("out_pharmacist_code")
	private String outPharmacistCode;

	/**
	 * 如果该处方单由合作方自有药师审核，则将合作方的药师姓名传入
	 */
	@ApiField("out_pharmacist_name")
	private String outPharmacistName;

	/**
	 * 平台药师编码，由支付宝购药平台生成，商家通过查询药师的接口可以获取到，在审核处方时，传入该值。
	 */
	@ApiField("pharmacist_code")
	private String pharmacistCode;

	/**
	 * 医院处方编号，该值由医院开方时生成，处方单流转至待审核状态时会将该字段同步给商家，审核时，将该值传入即可。 当前字段已废弃(根据平台处方id流转审核状态即可)
	 */
	@ApiField("prescription_code")
	@Deprecated
	private String prescriptionCode;

	/**
	 * 处方ID，由支付宝侧购药平台生成，处方单流转到待审核状态时，会通过【待审方订单推送】接口的prescription_id字段向外部商家同步该处方id，审核时将该值传入即可。
	 */
	@ApiField("prescription_id")
	private String prescriptionId;

	/**
	 * 驳回理由，若审方驳回，需要填写驳回理由
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * PASSED-药师审核通过，REJECTED-药师审核驳回
	 */
	@ApiField("review_result")
	private String reviewResult;

	/**
	 * 加签后的处方笺PDF链接
	 */
	@ApiField("signed_prsc_pdf_url")
	private String signedPrscPdfUrl;

	/**
	 * 如果该处方单由合作方自有药师审核，则将加签后的处方笺图片链接传入
	 */
	@ApiField("signed_prsc_pic_url")
	private String signedPrscPicUrl;

	/**
	 * 合作方外部门店编码，对应处方购药的门店，由商家生成。
	 */
	@ApiField("store_code")
	private String storeCode;

	public String getOutPharmacistCode() {
		return this.outPharmacistCode;
	}
	public void setOutPharmacistCode(String outPharmacistCode) {
		this.outPharmacistCode = outPharmacistCode;
	}

	public String getOutPharmacistName() {
		return this.outPharmacistName;
	}
	public void setOutPharmacistName(String outPharmacistName) {
		this.outPharmacistName = outPharmacistName;
	}

	public String getPharmacistCode() {
		return this.pharmacistCode;
	}
	public void setPharmacistCode(String pharmacistCode) {
		this.pharmacistCode = pharmacistCode;
	}

	public String getPrescriptionCode() {
		return this.prescriptionCode;
	}
	public void setPrescriptionCode(String prescriptionCode) {
		this.prescriptionCode = prescriptionCode;
	}

	public String getPrescriptionId() {
		return this.prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getReviewResult() {
		return this.reviewResult;
	}
	public void setReviewResult(String reviewResult) {
		this.reviewResult = reviewResult;
	}

	public String getSignedPrscPdfUrl() {
		return this.signedPrscPdfUrl;
	}
	public void setSignedPrscPdfUrl(String signedPrscPdfUrl) {
		this.signedPrscPdfUrl = signedPrscPdfUrl;
	}

	public String getSignedPrscPicUrl() {
		return this.signedPrscPicUrl;
	}
	public void setSignedPrscPicUrl(String signedPrscPicUrl) {
		this.signedPrscPicUrl = signedPrscPicUrl;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
