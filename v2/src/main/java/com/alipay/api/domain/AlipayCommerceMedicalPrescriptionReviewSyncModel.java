package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个处方药师审核结果同步
 *
 * @author auto create
 * @since 1.0, 2025-04-16 10:31:35
 */
public class AlipayCommerceMedicalPrescriptionReviewSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5886849924186377642L;

	/**
	 * 平台药师编码，由支付宝购药平台生成，商家通过查询药师的接口可以获取到，在审核处方时，传入该值。
	 */
	@ApiField("pharmacist_code")
	private String pharmacistCode;

	/**
	 * 医院处方编号，该值由医院开方时生成，处方单流转至待审核状态时会将该字段同步给商家，审核时，将该值传入即可。
	 */
	@ApiField("prescription_code")
	private String prescriptionCode;

	/**
	 * 处方ID，由支付宝侧购药平台生成，处方单流转到待审核状态时，会向外部商家同步该处方id，审核时将该值传入即可。
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
	 * 合作方外部门店编码，对应处方购药的门店，由商家生成。
	 */
	@ApiField("store_code")
	private String storeCode;

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

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
