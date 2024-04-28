package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款备注附件参数
 *
 * @author auto create
 * @since 1.0, 2023-03-15 20:48:16
 */
public class AttachmentFile extends AlipayObject {

	private static final long serialVersionUID = 1273267387768562849L;

	/**
	 * 附件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 附件地址
	 */
	@ApiField("oss_key")
	private String ossKey;

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
