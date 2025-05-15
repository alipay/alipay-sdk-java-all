package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业宠物照片信息，包含照片类型和照片url。
 *
 * @author auto create
 * @since 1.0, 2024-08-01 16:33:54
 */
public class IndustryPetPictureDTO extends AlipayObject {

	private static final long serialVersionUID = 2611667317847438463L;

	/**
	 * 照片类型
	 */
	@ApiField("image_type")
	private String imageType;

	/**
	 * 图片url
	 */
	@ApiField("image_url")
	private String imageUrl;

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
