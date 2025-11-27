package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.material.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-22 21:22:41
 */
public class AlipayMarketingMaterialImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6544732583954896845L;

	/** 
	 * 图片是否优化过。系统会根据要求，若上传的图片不符合要求的尺寸，会对上传的图片做尺寸的优化。
	 */
	@ApiField("resource_enhance")
	private Boolean resourceEnhance;

	/** 
	 * 图片唯一资源ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	/** 
	 * 上传后图片的url地址
	 */
	@ApiField("resource_url")
	private String resourceUrl;

	public void setResourceEnhance(Boolean resourceEnhance) {
		this.resourceEnhance = resourceEnhance;
	}
	public Boolean getResourceEnhance( ) {
		return this.resourceEnhance;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceId( ) {
		return this.resourceId;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}
	public String getResourceUrl( ) {
		return this.resourceUrl;
	}

}
