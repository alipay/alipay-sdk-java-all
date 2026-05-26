package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.file.url.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 16:22:45
 */
public class AnttechNftFileUrlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4696964333795233368L;

	/** 
	 * 私有URL的token
	 */
	@ApiField("file_token")
	private String fileToken;

	/** 
	 * 资源URL
	 */
	@ApiField("url")
	private String url;

	public void setFileToken(String fileToken) {
		this.fileToken = fileToken;
	}
	public String getFileToken( ) {
		return this.fileToken;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
