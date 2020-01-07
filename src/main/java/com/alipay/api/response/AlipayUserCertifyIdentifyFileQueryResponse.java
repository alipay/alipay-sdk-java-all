package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.identify.file.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-30 14:39:36
 */
public class AlipayUserCertifyIdentifyFileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4248174442549424117L;

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
