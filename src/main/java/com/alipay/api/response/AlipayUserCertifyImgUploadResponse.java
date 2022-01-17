package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.img.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-14 11:05:38
 */
public class AlipayUserCertifyImgUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8786176783929377447L;

	/** 
	 * 证件ID
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/** 
	 * 图片上传成功后，返回的图片地址
	 */
	@ApiField("pic_url")
	private String picUrl;

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateId( ) {
		return this.certificateId;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getPicUrl( ) {
		return this.picUrl;
	}

}
