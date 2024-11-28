package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 变更商品信息
 *
 * @author auto create
 * @since 1.0, 2024-07-10 10:29:11
 */
public class LinkedMallEditableProduct extends AlipayObject {

	private static final long serialVersionUID = 2454447839745519798L;

	/**
	 * 商品描述图
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
	 * 商品状态
	 */
	@ApiField("product_status")
	private String productStatus;

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

	public String getProductStatus() {
		return this.productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
