package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OSS文件详情
 *
 * @author auto create
 * @since 1.0, 2023-06-15 14:48:08
 */
public class OssObjectDetail extends AlipayObject {

	private static final long serialVersionUID = 2229897714375424973L;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件大小
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 文件状态
	 */
	@ApiField("status")
	private String status;

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

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
