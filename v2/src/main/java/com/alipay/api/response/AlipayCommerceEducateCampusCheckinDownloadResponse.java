package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.checkin.download response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 14:17:26
 */
public class AlipayCommerceEducateCampusCheckinDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8617688554327528365L;

	/** 
	 * file_path
	 */
	@ApiField("file_path")
	private String filePath;

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFilePath( ) {
		return this.filePath;
	}

}
