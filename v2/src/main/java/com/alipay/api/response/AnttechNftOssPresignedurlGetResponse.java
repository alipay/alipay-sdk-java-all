package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.oss.presignedurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-28 11:33:52
 */
public class AnttechNftOssPresignedurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7161167422721914356L;

	/** 
	 * oss回调头，包含回调方法体
	 */
	@ApiField("oss_header_callback")
	private String ossHeaderCallback;

	/** 
	 * 返回给第三方用于上传文件的预签名url。
	 */
	@ApiField("presigned_url")
	private String presignedUrl;

	public void setOssHeaderCallback(String ossHeaderCallback) {
		this.ossHeaderCallback = ossHeaderCallback;
	}
	public String getOssHeaderCallback( ) {
		return this.ossHeaderCallback;
	}

	public void setPresignedUrl(String presignedUrl) {
		this.presignedUrl = presignedUrl;
	}
	public String getPresignedUrl( ) {
		return this.presignedUrl;
	}

}
