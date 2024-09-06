package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV图片DTO
 *
 * @author auto create
 * @since 1.0, 2024-05-21 18:58:53
 */
public class IndrISVImageDTO extends AlipayObject {

	private static final long serialVersionUID = 6367926886161291137L;

	/**
	 * 图片格式，如JPG
	 */
	@ApiField("image_format")
	private String imageFormat;

	/**
	 * 图片id
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 图片类型
	 */
	@ApiField("image_type")
	private String imageType;

	/**
	 * 图片URL
	 */
	@ApiField("image_url")
	private String imageUrl;

	public String getImageFormat() {
		return this.imageFormat;
	}
	public void setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageType() {
		return this.imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
