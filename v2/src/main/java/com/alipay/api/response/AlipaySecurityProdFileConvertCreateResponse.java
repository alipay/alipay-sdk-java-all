package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.file.convert.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 13:52:21
 */
public class AlipaySecurityProdFileConvertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4523484189777995477L;

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
