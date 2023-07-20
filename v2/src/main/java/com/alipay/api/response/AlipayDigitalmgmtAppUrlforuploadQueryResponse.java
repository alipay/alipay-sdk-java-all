package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.app.urlforupload.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-17 19:32:00
 */
public class AlipayDigitalmgmtAppUrlforuploadQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2791477613632657323L;

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
