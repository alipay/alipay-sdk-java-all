package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.app.urlforupload.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-09 10:36:10
 */
public class AlipayDigitalmgmtAppUrlforuploadQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8373753712779313848L;

	/** 
	 * 无
	 */
	@ApiField("url_for_upload_file")
	private String urlForUploadFile;

	public void setUrlForUploadFile(String urlForUploadFile) {
		this.urlForUploadFile = urlForUploadFile;
	}
	public String getUrlForUploadFile( ) {
		return this.urlForUploadFile;
	}

}
