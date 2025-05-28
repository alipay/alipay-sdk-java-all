package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MaterialUploadDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.material.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-19 16:32:05
 */
public class AlipayDataDataserviceAdMaterialQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1457711282711761376L;

	/** 
	 * 物料上传结果详情
	 */
	@ApiField("material_upload_detail")
	private MaterialUploadDetail materialUploadDetail;

	public void setMaterialUploadDetail(MaterialUploadDetail materialUploadDetail) {
		this.materialUploadDetail = materialUploadDetail;
	}
	public MaterialUploadDetail getMaterialUploadDetail( ) {
		return this.materialUploadDetail;
	}

}
