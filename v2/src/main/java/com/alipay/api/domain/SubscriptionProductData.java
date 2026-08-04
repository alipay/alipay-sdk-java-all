package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅商品属性
 *
 * @author auto create
 * @since 1.0, 2026-07-29 10:40:55
 */
public class SubscriptionProductData extends AlipayObject {

	private static final long serialVersionUID = 6231659149116336265L;

	/**
	 * 商品描述，按商户请求原样保存到商品快照
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品图片 URL 列表，必须是合法的 JSON string array 字符串，建议不超过 5 个元素
	 */
	@ApiField("images")
	private String images;

	/**
	 * 商品营销特性列表，必须是合法的 JSON string array 字符串，建议不超过 5 个元素
	 */
	@ApiField("marketing_features")
	private String marketingFeatures;

	/**
	 * 商品元数据，必须是合法的 JSON object 字符串，且每个 value 必须是字符串
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 商品名称，不能为空，用于签约页和订阅商品展示
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品计量单位描述，例如 seat、席位，按商户请求原样保存
	 */
	@ApiField("unit_label")
	private String unitLabel;

	/**
	 * 商品详情页 URL
	 */
	@ApiField("url")
	private String url;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getImages() {
		return this.images;
	}
	public void setImages(String images) {
		this.images = images;
	}

	public String getMarketingFeatures() {
		return this.marketingFeatures;
	}
	public void setMarketingFeatures(String marketingFeatures) {
		this.marketingFeatures = marketingFeatures;
	}

	public String getMetadata() {
		return this.metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUnitLabel() {
		return this.unitLabel;
	}
	public void setUnitLabel(String unitLabel) {
		this.unitLabel = unitLabel;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
