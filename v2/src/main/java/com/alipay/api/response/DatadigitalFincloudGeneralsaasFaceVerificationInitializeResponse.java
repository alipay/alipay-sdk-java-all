package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.verification.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-07 14:57:01
 */
public class DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3498784936922798846L;

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

	/** 
	 * H5人脸核身地址
	 */
	@ApiField("web_url")
	private String webUrl;

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

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}
	public String getWebUrl( ) {
		return this.webUrl;
	}

}
