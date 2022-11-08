package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单商品详情
 *
 * @author auto create
 * @since 1.0, 2022-05-12 10:10:13
 */
public class SpuInfo extends AlipayObject {

	private static final long serialVersionUID = 4393771923154148823L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 商品数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 图片链接
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 商品单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品提供方，店铺或品牌方
	 */
	@ApiField("provider")
	private String provider;

	/**
	 * 商品ID
	 */
	@ApiField("spu_id")
	private String spuId;

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

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProvider() {
		return this.provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

}
