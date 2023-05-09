package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.verification.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:11:53
 */
public class DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5391243922217679453L;

	/** 
	 * 认证单据号，请保留以便排查问题。
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * 人脸核身url
	 */
	@ApiField("page_url")
	private String pageUrl;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public String getPageUrl( ) {
		return this.pageUrl;
	}

}
