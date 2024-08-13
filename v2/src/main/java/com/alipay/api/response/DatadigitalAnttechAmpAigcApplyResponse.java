package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.amp.aigc.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-21 17:47:04
 */
public class DatadigitalAnttechAmpAigcApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1249477588864455366L;

	/** 
	 * 文件url
	 */
	@ApiField("file_url")
	private String fileUrl;

	/** 
	 * 文件生成状态
	 */
	@ApiField("other_data")
	private String otherData;

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

	public void setOtherData(String otherData) {
		this.otherData = otherData;
	}
	public String getOtherData( ) {
		return this.otherData;
	}

}
