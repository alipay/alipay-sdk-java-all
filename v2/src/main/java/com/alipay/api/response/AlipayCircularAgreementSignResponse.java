package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.circular.agreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-22 14:22:41
 */
public class AlipayCircularAgreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8838884163384719942L;

	/** 
	 * 签约状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 代扣页面链接
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
