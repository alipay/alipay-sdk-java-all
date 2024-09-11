package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品详情-菜品数据DTO
 *
 * @author auto create
 * @since 1.0, 2017-08-24 13:56:10
 */
public class ItemDishInfo extends AlipayObject {

	private static final long serialVersionUID = 4492961572595177798L;

	/**
	 * 商品详情-菜品图片中的图片描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 详情图片中，菜品图片列表
	 */
	@ApiListField("image_urls")
	@ApiField("string")
	private List<String> imageUrls;

	/**
	 * 详情图片中，菜品标题。请勿超过15汉字，30个字符
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

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
