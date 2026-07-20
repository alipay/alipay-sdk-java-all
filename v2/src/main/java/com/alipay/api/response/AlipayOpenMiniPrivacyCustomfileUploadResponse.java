package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.privacy.customfile.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-20 10:02:53
 */
public class AlipayOpenMiniPrivacyCustomfileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7334256975734786921L;

	/** 
	 * 文件上传成功后，返回文件地址，用于create接口调用时传入。
	 */
	@ApiField("user_custom_file")
	private String userCustomFile;

	public void setUserCustomFile(String userCustomFile) {
		this.userCustomFile = userCustomFile;
	}
	public String getUserCustomFile( ) {
		return this.userCustomFile;
	}

}
