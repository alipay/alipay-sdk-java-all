package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件信息
 *
 * @author auto create
 * @since 1.0, 2024-01-25 10:00:34
 */
public class OutOrderAttachmentInfo extends AlipayObject {

	private static final long serialVersionUID = 8359918188694751918L;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件路径
	 */
	@ApiField("file_path")
	private String filePath;

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
