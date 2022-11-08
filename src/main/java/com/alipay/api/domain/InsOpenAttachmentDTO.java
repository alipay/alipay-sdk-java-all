package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台-报案接口-报案材料模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:21:59
 */
public class InsOpenAttachmentDTO extends AlipayObject {

	private static final long serialVersionUID = 1792955886266194288L;

	/**
	 * afts的id
	 */
	@ApiField("afts_file_id")
	private String aftsFileId;

	/**
	 * 基础业务数据
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 文件路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 文件大小
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 附件类型
	 */
	@ApiField("type")
	private Long type;

	public String getAftsFileId() {
		return this.aftsFileId;
	}
	public void setAftsFileId(String aftsFileId) {
		this.aftsFileId = aftsFileId;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
