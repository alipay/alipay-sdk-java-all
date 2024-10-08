package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.filewebofficeurl.generate response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 19:47:04
 */
public class AlipaySecurityProdTemplateFilewebofficeurlGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7182699255681127312L;

	/** 
	 * 文档编辑ak
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 文件地址
	 */
	@ApiField("file_key")
	private String fileKey;

	/** 
	 * 刷新用的oss文件编辑token
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/** 
	 * 文档编辑url
	 */
	@ApiField("weboffice_url")
	private String webofficeUrl;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}
	public String getFileKey( ) {
		return this.fileKey;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getRefreshToken( ) {
		return this.refreshToken;
	}

	public void setWebofficeUrl(String webofficeUrl) {
		this.webofficeUrl = webofficeUrl;
	}
	public String getWebofficeUrl( ) {
		return this.webofficeUrl;
	}

}
