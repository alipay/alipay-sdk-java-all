package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OSS文件详情
 *
 * @author auto create
 * @since 1.0, 2023-07-27 15:25:54
 */
public class OssObjectDetail extends AlipayObject {

	private static final long serialVersionUID = 4214781782955361389L;

	/**
	 * 文件创建时间，格式为0时区iso8601格式
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 文件ID(唯一)，文件的唯一索引ID，上传文件后系统会创建返回该文件的文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件大小，单位为Byte
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 文件状态
	 */
	@ApiField("status")
	private String status;

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

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
