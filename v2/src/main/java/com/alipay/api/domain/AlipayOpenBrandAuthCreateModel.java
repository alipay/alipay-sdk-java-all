package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌认证
 *
 * @author auto create
 * @since 1.0, 2025-12-16 14:42:43
 */
public class AlipayOpenBrandAuthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2368233349879757428L;

	/**
	 * 补充信息
	 */
	@ApiField("brand_additional_info")
	private BrandAuthAdditionalInfoOpenApi brandAdditionalInfo;

	/**
	 * 品牌授权材料
	 */
	@ApiField("brand_auth_material")
	private BrandAuthMaterialInfoOpenApi brandAuthMaterial;

	/**
	 * 在B站-品牌管理可以找到品牌id或者以B开头的品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	public BrandAuthAdditionalInfoOpenApi getBrandAdditionalInfo() {
		return this.brandAdditionalInfo;
	}
	public void setBrandAdditionalInfo(BrandAuthAdditionalInfoOpenApi brandAdditionalInfo) {
		this.brandAdditionalInfo = brandAdditionalInfo;
	}

	public BrandAuthMaterialInfoOpenApi getBrandAuthMaterial() {
		return this.brandAuthMaterial;
	}
	public void setBrandAuthMaterial(BrandAuthMaterialInfoOpenApi brandAuthMaterial) {
		this.brandAuthMaterial = brandAuthMaterial;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

}
