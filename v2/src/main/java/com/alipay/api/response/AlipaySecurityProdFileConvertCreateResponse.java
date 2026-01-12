package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.file.convert.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-11 10:33:07
 */
public class AlipaySecurityProdFileConvertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7795256172842165124L;

	/** 
	 * 转换任务id
	 */
	@ApiField("convert_task_id")
	private String convertTaskId;

	/** 
	 * 转换目标路径
	 */
	@ApiField("target_file_path")
	private String targetFilePath;

	public void setConvertTaskId(String convertTaskId) {
		this.convertTaskId = convertTaskId;
	}
	public String getConvertTaskId( ) {
		return this.convertTaskId;
	}

	public void setTargetFilePath(String targetFilePath) {
		this.targetFilePath = targetFilePath;
	}
	public String getTargetFilePath( ) {
		return this.targetFilePath;
	}

}
