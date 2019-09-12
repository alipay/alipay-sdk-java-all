package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.item.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-09 14:51:23
 */
public class AlipayMerchantItemFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7155159794396261495L;

	/** 
	 * 文件在商品中心的素材标识
	 */
	@ApiField("material_id")
	private String materialId;

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	public String getMaterialId( ) {
		return this.materialId;
	}

}
