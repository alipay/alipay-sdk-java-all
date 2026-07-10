package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件链接获取
 *
 * @author auto create
 * @since 1.0, 2026-04-14 16:22:45
 */
public class AnttechNftFileUrlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8284857647511935159L;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * true-私有url
其他为公开url默认false
	 */
	@ApiField("is_private")
	private String isPrivate;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getIsPrivate() {
		return this.isPrivate;
	}
	public void setIsPrivate(String isPrivate) {
		this.isPrivate = isPrivate;
	}

}
