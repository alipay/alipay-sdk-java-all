package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.sign.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:40:35
 */
public class AlipayCloudCloudbaseWalletSignConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3193524621658181438L;

	/** 
	 * 签约原始链接地址
	 */
	@ApiField("original_url")
	private String originalUrl;

	/** 
	 * 签约短链接地址
	 */
	@ApiField("short_url")
	private String shortUrl;

	/** 
	 * 签约结果
	 */
	@ApiField("status")
	private Boolean status;

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}
	public String getOriginalUrl( ) {
		return this.originalUrl;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getShortUrl( ) {
		return this.shortUrl;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
