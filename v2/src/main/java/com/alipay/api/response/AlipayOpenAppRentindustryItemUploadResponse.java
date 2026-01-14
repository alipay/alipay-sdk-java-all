package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantSkuUploadResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.rentindustry.item.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-06 16:22:42
 */
public class AlipayOpenAppRentindustryItemUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8387848412833861324L;

	/** 
	 * 商品上传结果信息
	 */
	@ApiListField("upload_result")
	@ApiField("merchant_sku_upload_result")
	private List<MerchantSkuUploadResult> uploadResult;

	public void setUploadResult(List<MerchantSkuUploadResult> uploadResult) {
		this.uploadResult = uploadResult;
	}
	public List<MerchantSkuUploadResult> getUploadResult( ) {
		return this.uploadResult;
	}

}
