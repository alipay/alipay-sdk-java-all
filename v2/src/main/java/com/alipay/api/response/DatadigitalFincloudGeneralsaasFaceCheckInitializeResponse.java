package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.check.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-07 14:55:23
 */
public class DatadigitalFincloudGeneralsaasFaceCheckInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3648912845391667473L;

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
