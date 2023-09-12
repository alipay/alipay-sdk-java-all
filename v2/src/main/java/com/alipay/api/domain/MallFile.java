package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 10:37:44
 */
public class MallFile extends AlipayObject {

	private static final long serialVersionUID = 3387796567551972666L;

	/**
	 * file_md_5，用于下pr单
	 */
	@ApiField("file_md_5")
	private String fileMd5;

	/**
	 * file_name，用于下pr单
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * file_url，用于下pr单
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getFileMd5() {
		return this.fileMd5;
	}
	public void setFileMd5(String fileMd5) {
		this.fileMd5 = fileMd5;
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
