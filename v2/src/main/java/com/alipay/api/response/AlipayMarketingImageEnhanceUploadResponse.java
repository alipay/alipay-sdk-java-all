package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.image.enhance.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-21 15:39:51
 */
public class AlipayMarketingImageEnhanceUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1156998991625767386L;

	/** 
	 * 图片是否优化过。若上传选择需要优化，且上传的图片不符合规范，会对图片进行优化。
	 */
	@ApiField("image_enhanced")
	private Boolean imageEnhanced;

	/** 
	 * 图片唯一资源ID
	 */
	@ApiField("image_id")
	private String imageId;

	/** 
	 * 图索引id。图片在相册中的索引id。
	 */
	@ApiField("image_index_id")
	private String imageIndexId;

	/** 
	 * 图片上传后返回的链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	public void setImageEnhanced(Boolean imageEnhanced) {
		this.imageEnhanced = imageEnhanced;
	}
	public Boolean getImageEnhanced( ) {
		return this.imageEnhanced;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageId( ) {
		return this.imageId;
	}

	public void setImageIndexId(String imageIndexId) {
		this.imageIndexId = imageIndexId;
	}
	public String getImageIndexId( ) {
		return this.imageIndexId;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageUrl( ) {
		return this.imageUrl;
	}

}
