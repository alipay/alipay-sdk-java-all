package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.iot.nfcpoint.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-31 18:07:26
 */
public class AlipayPayIotNfcpointUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7344755145665931214L;

	/** 
	 * 文件素材id
	 */
	@ApiField("material_id")
	private String materialId;

	/** 
	 * 图片地址
	 */
	@ApiField("material_url")
	private String materialUrl;

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	public String getMaterialId( ) {
		return this.materialId;
	}

	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}
	public String getMaterialUrl( ) {
		return this.materialUrl;
	}

}
