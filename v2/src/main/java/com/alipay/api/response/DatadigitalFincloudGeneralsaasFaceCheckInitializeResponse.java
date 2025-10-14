package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.check.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-18 16:57:05
 */
public class DatadigitalFincloudGeneralsaasFaceCheckInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6179477367117948338L;

	/** 
	 * 人脸检测流水ID，请保留方便排查问题
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * 检测页面url，需要给到终端SDK
	 */
	@ApiField("page_url")
	private String pageUrl;

	/** 
	 * H5活体检测地址
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
