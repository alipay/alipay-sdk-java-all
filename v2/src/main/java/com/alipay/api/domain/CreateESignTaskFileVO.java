package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建签约任务文件列表及审批流附件列表VO
 *
 * @author auto create
 * @since 1.0, 2023-10-08 13:48:26
 */
public class CreateESignTaskFileVO extends AlipayObject {

	private static final long serialVersionUID = 1623168314136258925L;

	/**
	 * 文件唯一id 64 位
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件地址，即上传路径，上传失败则无值
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件预览链接
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
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
