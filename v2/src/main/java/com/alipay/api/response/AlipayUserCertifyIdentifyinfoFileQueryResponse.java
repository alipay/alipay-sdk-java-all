package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.identifyinfo.file.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-31 18:49:46
 */
public class AlipayUserCertifyIdentifyinfoFileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2217152114613667342L;

	/** 
	 * 文件的base64
	 */
	@ApiField("file")
	private String file;

	public void setFile(String file) {
		this.file = file;
	}
	public String getFile( ) {
		return this.file;
	}

}
