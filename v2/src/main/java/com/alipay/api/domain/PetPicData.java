package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物图片列表
 *
 * @author auto create
 * @since 1.0, 2020-09-14 19:14:40
 */
public class PetPicData extends AlipayObject {

	private static final long serialVersionUID = 7852572197758997615L;

	/**
	 * 宠物照片类型，如全身照、鼻纹照
	 */
	@ApiField("image_type")
	private String imageType;

	/**
	 * 宠物照片地址
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
