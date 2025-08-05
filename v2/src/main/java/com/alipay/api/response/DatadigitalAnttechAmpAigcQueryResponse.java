package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.amp.aigc.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-16 11:42:01
 */
public class DatadigitalAnttechAmpAigcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3477472533334671464L;

	/** 
	 * 文件url
	 */
	@ApiField("file_url")
	private String fileUrl;

	/** 
	 * 生成状态
	 */
	@ApiField("status")
	private String status;

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
