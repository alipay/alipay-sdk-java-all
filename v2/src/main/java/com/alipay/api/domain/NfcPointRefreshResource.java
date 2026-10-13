package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-09 15:27:54
 */
public class NfcPointRefreshResource extends AlipayObject {

	private static final long serialVersionUID = 1216912727229453537L;

	/**
	 * 素材文件地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 素材标识
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 素材在海报计划中配置的展示位置，取值随素材配置变化
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * 素材文件格式，取值由海报计划关联的素材文件决定，不限定固定枚举
	 */
	@ApiField("type")
	private String type;

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
