package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthca.pharmorprscrsign.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-06 16:12:28
 */
public class AlipayCommerceMedicalHealthcaPharmorprscrsignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6811716586479455648L;

	/** 
	 * 药师签名图片的AFTS的fileId（创建药师入驻二维码的时候才会有值）
	 */
	@ApiField("sign_name_file_id")
	private String signNameFileId;

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
	 * 签署状态：SIGNED-签署完成，SIGNING-签署中，REJECTED-拒绝签署（SIGNED签署完成才会其他返回值）
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setSignNameFileId(String signNameFileId) {
		this.signNameFileId = signNameFileId;
	}
	public String getSignNameFileId( ) {
		return this.signNameFileId;
	}

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
