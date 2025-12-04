package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通话录音数据对象
 *
 * @author auto create
 * @since 1.0, 2023-10-16 16:43:09
 */
public class MonoRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 4793872915296181786L;

	/**
	 * 通话录音文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 通话录音文件在OSS的存储地址的临时可用链接
	 */
	@ApiField("file_url")
	private String fileUrl;

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
