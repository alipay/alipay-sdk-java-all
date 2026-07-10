package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品创建
 *
 * @author auto create
 * @since 1.0, 2026-06-08 19:47:57
 */
public class AlipayTradeProductCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1373348241362921698L;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 图片地址，支持传入不超过5个地址
	 */
	@ApiField("images")
	private String images;

	/**
	 * 营销信息，支持传入不超过5个营销信息
	 */
	@ApiField("marketing_features")
	private String marketingFeatures;

	/**
	 * 商户需要保存在商品模型中的元数据
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 单位别名
	 */
	@ApiField("unit_label")
	private String unitLabel;

	/**
	 * 可用于跳转商户网址地址
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
