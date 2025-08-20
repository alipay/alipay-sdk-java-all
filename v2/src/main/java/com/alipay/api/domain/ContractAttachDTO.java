package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件DTO
 *
 * @author auto create
 * @since 1.0, 2021-11-02 09:55:02
 */
public class ContractAttachDTO extends AlipayObject {

	private static final long serialVersionUID = 8716336772136751478L;

	/**
	 * filekey
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
