package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.file.upload.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 10:42:03
 */
public class AntfortuneFinresearchFileUploadInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6878665412378451874L;

	/** 
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 接口请求是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
