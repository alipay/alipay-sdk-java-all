package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-31 16:07:53
 */
public class FileItem extends AlipayObject {

	private static final long serialVersionUID = 4298318494251571191L;

	/**
	 * afts 文件 id
	 */
	@ApiField("afts_id")
	private String aftsId;

	/**
	 * 文件类型（IMAGE 图片 / VIDEO 视频 / FILE 通用文件）
	 */
	@ApiField("file_type")
	private String fileType;

	public String getAftsId() {
		return this.aftsId;
	}
	public void setAftsId(String aftsId) {
		this.aftsId = aftsId;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}
