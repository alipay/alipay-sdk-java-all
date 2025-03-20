package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁文件对象
 *
 * @author auto create
 * @since 1.0, 2025-03-18 16:05:55
 */
public class RentFile extends AlipayObject {

	private static final long serialVersionUID = 7868199136981759293L;

	/**
	 * 支付宝文件系统的afts的key，取值：通过支付宝文件上传接口获取
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件的名称，取值：基于上传的文件决定
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件的访问地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
