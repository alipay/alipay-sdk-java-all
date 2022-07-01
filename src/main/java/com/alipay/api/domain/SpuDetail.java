package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2020-11-16 16:22:05
 */
public class SpuDetail extends AlipayObject {

	private static final long serialVersionUID = 3854752323996569439L;

	/**
	 * 商品品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 商品类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 商品规格
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 商品图片地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 商品链接
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 商品ID
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
