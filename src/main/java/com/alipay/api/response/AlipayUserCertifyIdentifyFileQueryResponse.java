package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.identify.file.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-08 10:54:05
 */
public class AlipayUserCertifyIdentifyFileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6846153158229582878L;

	/** 
	 * 文件的base64数据，一般情况是小于2M的
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
