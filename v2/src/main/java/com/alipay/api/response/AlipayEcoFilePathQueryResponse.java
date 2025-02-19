package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.file.path.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:18:51
 */
public class AlipayEcoFilePathQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1792387912273497814L;

	/** 
	 * 文件Id
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 文件直传地址, 可以重复使用，但是只能传一样的文件，有效期一小时
	 */
	@ApiField("upload_url")
	private String uploadUrl;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
	}
	public String getUploadUrl( ) {
		return this.uploadUrl;
	}

}
