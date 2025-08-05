package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.filetask.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 15:55:24
 */
public class AlipayMerchantIndirectFiletaskConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7752214476819734232L;

	/** 
	 * 下载文件时配合返回的file_url使用，用于用户请求鉴权。请求file_url时，需要在请求header中添加 x-mass-token=${auth_token}
	 */
	@ApiField("auth_token")
	private String authToken;

	/** 
	 * 文件下载地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/** 
	 * 文件任务处理结果
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getAuthToken( ) {
		return this.authToken;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
