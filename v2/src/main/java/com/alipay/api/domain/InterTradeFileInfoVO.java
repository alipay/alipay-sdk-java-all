package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联交易文件信息
 *
 * @author auto create
 * @since 1.0, 2020-12-24 20:46:36
 */
public class InterTradeFileInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3317732448666796837L;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 关联交易审批单发起来源
	 */
	@ApiField("file_source")
	private String fileSource;

	/**
	 * 文件存储类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileSource() {
		return this.fileSource;
	}
	public void setFileSource(String fileSource) {
		this.fileSource = fileSource;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
