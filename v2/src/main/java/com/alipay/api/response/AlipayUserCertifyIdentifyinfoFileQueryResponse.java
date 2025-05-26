package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.identifyinfo.file.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-28 10:32:08
 */
public class AlipayUserCertifyIdentifyinfoFileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8495268917222135135L;

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
