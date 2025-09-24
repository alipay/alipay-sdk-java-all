package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BC互动获取文件下载url
 *
 * @author auto create
 * @since 1.0, 2021-10-15 18:12:08
 */
public class AlipaySocialBaseFileUrlGetModel extends AlipayObject {

	private static final long serialVersionUID = 5243423995874854359L;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 上传文件编码格式
	 */
	@ApiField("source_format")
	private String sourceFormat;

	/**
	 * 目标转换文件编码格式
	 */
	@ApiField("target_format")
	private String targetFormat;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getSourceFormat() {
		return this.sourceFormat;
	}
	public void setSourceFormat(String sourceFormat) {
		this.sourceFormat = sourceFormat;
	}

	public String getTargetFormat() {
		return this.targetFormat;
	}
	public void setTargetFormat(String targetFormat) {
		this.targetFormat = targetFormat;
	}

}
