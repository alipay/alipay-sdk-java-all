package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthca.prescriptionpic.approve response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-06 16:17:27
 */
public class AlipayCommerceMedicalHealthcaPrescriptionpicApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7716333252552478511L;

	/** 
	 * 加签完成的图片的AFTS的fileId
	 */
	@ApiField("sign_pic_file_id")
	private String signPicFileId;

	/** 
	 * 加签完成的图片的访问链接
	 */
	@ApiField("sign_pic_url")
	private String signPicUrl;

	public void setSignPicFileId(String signPicFileId) {
		this.signPicFileId = signPicFileId;
	}
	public String getSignPicFileId( ) {
		return this.signPicFileId;
	}

	public void setSignPicUrl(String signPicUrl) {
		this.signPicUrl = signPicUrl;
	}
	public String getSignPicUrl( ) {
		return this.signPicUrl;
	}

}
