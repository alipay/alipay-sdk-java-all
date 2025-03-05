package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缺材信息
 *
 * @author auto create
 * @since 1.0, 2024-12-10 17:36:40
 */
public class LackMaterial extends AlipayObject {

	private static final long serialVersionUID = 3324944987582228514L;

	/**
	 * 补充材料话术
	 */
	@ApiField("description")
	private String description;

	/**
	 * 补充材料类型
	 */
	@ApiField("material_type")
	private String materialType;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

}
