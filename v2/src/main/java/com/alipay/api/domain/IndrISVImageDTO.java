package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV图片DTO
 *
 * @author auto create
 * @since 1.0, 2023-05-06 14:28:43
 */
public class IndrISVImageDTO extends AlipayObject {

	private static final long serialVersionUID = 8211646921298245744L;

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

}
