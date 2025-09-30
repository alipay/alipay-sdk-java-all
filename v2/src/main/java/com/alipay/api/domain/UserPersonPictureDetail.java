package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户个人证件图片数据
 *
 * @author auto create
 * @since 1.0, 2025-05-12 10:18:22
 */
public class UserPersonPictureDetail extends AlipayObject {

	private static final long serialVersionUID = 1693128985282296294L;

	/**
	 * 用户证件图片字节流对应的Base64数据,没有携带Data URL前缀
	 */
	@ApiField("picture_data")
	private String pictureData;

	/**
	 * 用户证件图片链接
	 */
	@ApiField("picture_url")
	private String pictureUrl;

	public String getPictureData() {
		return this.pictureData;
	}
	public void setPictureData(String pictureData) {
		this.pictureData = pictureData;
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

}
