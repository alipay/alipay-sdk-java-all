package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件基本信息
 *
 * @author auto create
 * @since 1.0, 2022-04-26 17:52:37
 */
public class FileInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3233744612686947487L;

	/**
	 * 加密方式
	 */
	@ApiField("encode_type")
	private String encodeType;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件大小
	 */
	@ApiField("file_size")
	private Long fileSize;

	/**
	 * 文件路径
	 */
	@ApiField("url")
	private String url;

	public String getEncodeType() {
		return this.encodeType;
	}
	public void setEncodeType(String encodeType) {
		this.encodeType = encodeType;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
