package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 素材数据模型
 *
 * @author auto create
 * @since 1.0, 2019-09-06 10:28:00
 */
public class MaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 5724356454974475993L;

	/**
	 * 素材内容（素材地址或素材KEY）
	 */
	@ApiField("content")
	private String content;

	/**
	 * 素材ID
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 素材类型
	 */
	@ApiField("type")
	private String type;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
