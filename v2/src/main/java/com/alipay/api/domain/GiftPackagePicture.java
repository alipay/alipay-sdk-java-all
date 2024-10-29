package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店价格计划中，套餐对应的图片详情
 *
 * @author auto create
 * @since 1.0, 2024-07-05 18:25:10
 */
public class GiftPackagePicture extends AlipayObject {

	private static final long serialVersionUID = 5614154394485638279L;

	/**
	 * 礼包套餐图片顺序，树脂越小，越靠前显示
	 */
	@ApiField("img_index")
	private Long imgIndex;

	/**
	 * 礼包套餐图片地址
	 */
	@ApiField("img_url")
	private String imgUrl;

	public Long getImgIndex() {
		return this.imgIndex;
	}
	public void setImgIndex(Long imgIndex) {
		this.imgIndex = imgIndex;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
