package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthca.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-11 17:17:40
 */
public class AlipayCommerceMedicalHealthcaSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4476869726197457765L;

	/** 
	 * 签署完成的PDF的AFTS的fileId
	 */
	@ApiField("sign_pdf_file_id")
	private String signPdfFileId;

	/** 
	 * 签署完成的PDF的访问链接
	 */
	@ApiField("sign_pdf_url")
	private String signPdfUrl;

	/** 
	 * 签署合同状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setSignPdfFileId(String signPdfFileId) {
		this.signPdfFileId = signPdfFileId;
	}
	public String getSignPdfFileId( ) {
		return this.signPdfFileId;
	}

	public void setSignPdfUrl(String signPdfUrl) {
		this.signPdfUrl = signPdfUrl;
	}
	public String getSignPdfUrl( ) {
		return this.signPdfUrl;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
