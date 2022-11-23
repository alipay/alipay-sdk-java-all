package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品详情-商家介绍数据结构
 *
 * @author auto create
 * @since 1.0, 2017-09-21 12:59:25
 */
public class IntroductionInfo extends AlipayObject {

	private static final long serialVersionUID = 4424164741212957685L;

	/**
	 * 商品详情-商家介绍图片地址列表
	 */
	@ApiListField("image_urls")
	@ApiField("string")
	private List<String> imageUrls;

	/**
	 * 商品详情-商家介绍标题
	 */
	@ApiField("title")
	private String title;

	public List<String> getImageUrls() {
		return this.imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
