package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-22 21:52:40
 */
public class AlipayCloudCloudpromoFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7614119337332419971L;

	/** 
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 是否安全审核通过
	 */
	@ApiField("safed")
	private Boolean safed;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setSafed(Boolean safed) {
		this.safed = safed;
	}
	public Boolean getSafed( ) {
		return this.safed;
	}

}
