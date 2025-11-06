package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.circular.agreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-22 10:27:40
 */
public class AlipayCircularAgreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7582825549345411891L;

	/** 
	 * 签约状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 代扣页面链接，与sign_channel关联
	 */
	@ApiField("url")
	private String url;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
