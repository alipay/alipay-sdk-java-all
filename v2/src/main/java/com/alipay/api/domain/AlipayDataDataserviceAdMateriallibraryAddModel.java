package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 素材库新增
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:34:36
 */
public class AlipayDataDataserviceAdMateriallibraryAddModel extends AlipayObject {

	private static final long serialVersionUID = 3277359483124394869L;

	/**
	 * 文件id值
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 用于保存素材文件的名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 1表示图片，2表示视频
	 */
	@ApiField("material_type")
	private Long materialType;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

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

	public Long getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(Long materialType) {
		this.materialType = materialType;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
