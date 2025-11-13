package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件信息
 *
 * @author auto create
 * @since 1.0, 2025-09-22 13:37:56
 */
public class AttachmentFileInfo extends AlipayObject {

	private static final long serialVersionUID = 8764538446776526596L;

	/**
	 * 合同的相关描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 可直接访问并下载文件的http地址
	 */
	@ApiField("file_http_url")
	private String fileHttpUrl;

	/**
	 * 文件的显示名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * oss地址
	 */
	@ApiField("oss_key")
	private String ossKey;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getFileHttpUrl() {
		return this.fileHttpUrl;
	}
	public void setFileHttpUrl(String fileHttpUrl) {
		this.fileHttpUrl = fileHttpUrl;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getOssKey() {
		return this.ossKey;
	}
	public void setOssKey(String ossKey) {
		this.ossKey = ossKey;
	}

}
