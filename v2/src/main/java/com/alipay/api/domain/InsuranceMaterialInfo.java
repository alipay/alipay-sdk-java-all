package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-26 17:37:42
 */
public class InsuranceMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 2477717158888434681L;

	/**
	 * 材料内容
	 */
	@ApiField("material_content")
	private String materialContent;

	/**
	 * 材料描述
	 */
	@ApiField("material_desc")
	private String materialDesc;

	/**
	 * 材料类型
	 */
	@ApiField("material_type")
	private String materialType;

	public String getMaterialContent() {
		return this.materialContent;
	}
	public void setMaterialContent(String materialContent) {
		this.materialContent = materialContent;
	}

	public String getMaterialDesc() {
		return this.materialDesc;
	}
	public void setMaterialDesc(String materialDesc) {
		this.materialDesc = materialDesc;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

}
