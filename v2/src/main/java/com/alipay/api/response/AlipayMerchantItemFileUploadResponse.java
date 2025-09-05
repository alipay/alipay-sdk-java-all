package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.item.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 16:17:42
 */
public class AlipayMerchantItemFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8492565159688291877L;

	/** 
	 * 文件在商品中心的素材标识（素材ID长期有效）
	 */
	@ApiField("material_id")
	private String materialId;

	/** 
	 * 文件在商品中心的素材标示，创建/更新商品时使用
	 */
	@ApiField("material_key")
	private String materialKey;

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	public String getMaterialId( ) {
		return this.materialId;
	}

	public void setMaterialKey(String materialKey) {
		this.materialKey = materialKey;
	}
	public String getMaterialKey( ) {
		return this.materialKey;
	}

}
