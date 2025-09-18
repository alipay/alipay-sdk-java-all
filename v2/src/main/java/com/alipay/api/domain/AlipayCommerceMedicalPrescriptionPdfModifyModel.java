package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新处方pdf
 *
 * @author auto create
 * @since 1.0, 2025-05-14 18:03:57
 */
public class AlipayCommerceMedicalPrescriptionPdfModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6575953729948613468L;

	/**
	 * 处方id
	 */
	@ApiField("prescription_id")
	private String prescriptionId;

	/**
	 * 加签后的处方笺PDF的url地址
	 */
	@ApiField("signed_prsc_pdf_url")
	private String signedPrscPdfUrl;

	/**
	 * 门店code
	 */
	@ApiField("store_code")
	private String storeCode;

	public String getPrescriptionId() {
		return this.prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getSignedPrscPdfUrl() {
		return this.signedPrscPdfUrl;
	}
	public void setSignedPrscPdfUrl(String signedPrscPdfUrl) {
		this.signedPrscPdfUrl = signedPrscPdfUrl;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
