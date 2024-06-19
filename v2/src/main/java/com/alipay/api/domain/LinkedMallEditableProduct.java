package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 变更商品信息
 *
 * @author auto create
 * @since 1.0, 2024-06-07 13:59:54
 */
public class LinkedMallEditableProduct extends AlipayObject {

	private static final long serialVersionUID = 4627812858996936323L;

	/**
	 * 商品描述
	 */
	@ApiField("desc_path")
	private String descPath;

	/**
	 * 商品副图
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 商品主图链接
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public String getDescPath() {
		return this.descPath;
	}
	public void setDescPath(String descPath) {
		this.descPath = descPath;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
