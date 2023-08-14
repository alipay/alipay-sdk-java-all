package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户合投认证的材料信息
 *
 * @author auto create
 * @since 1.0, 2023-05-30 14:16:41
 */
public class InvestorMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 8682461992156697195L;

	/**
	 * 材料文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 材料文件链接
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 合投材料类型
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 用户材料类型大类
	 */
	@ApiField("type")
	private String type;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
