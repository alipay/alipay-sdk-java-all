package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-26 18:22:48
 */
public class InsuranceMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 1798249378124439338L;

	/**
	 * 材料扩展数据
	 */
	@ApiField("ext_data")
	private String extData;

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

	/**
	 * 材料链接
	 */
	@ApiField("material_url")
	private String materialUrl;

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

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

	public String getMaterialUrl() {
		return this.materialUrl;
	}
	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}

}
