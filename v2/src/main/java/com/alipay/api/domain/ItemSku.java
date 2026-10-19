package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * SKU商品信息
 *
 * @author auto create
 * @since 1.0, 2026-10-10 10:20:20
 */
public class ItemSku extends AlipayObject {

	private static final long serialVersionUID = 4792788213744997546L;

	/**
	 * 原价，单位分。 字段值需要大于或等于sale_price。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 外部SKU编码
	 */
	@ApiField("out_sku_code")
	private String outSkuCode;

	/**
	 * 售价，单位分
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * SKU属性列表，具体所需属性见类目模版查询接口
	 */
	@ApiListField("sku_attrs")
	@ApiField("item_sku_attr")
	private List<ItemSkuAttr> skuAttrs;

	/**
	 * 平台SKU编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutSkuCode() {
		return this.outSkuCode;
	}
	public void setOutSkuCode(String outSkuCode) {
		this.outSkuCode = outSkuCode;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public List<ItemSkuAttr> getSkuAttrs() {
		return this.skuAttrs;
	}
	public void setSkuAttrs(List<ItemSkuAttr> skuAttrs) {
		this.skuAttrs = skuAttrs;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

}
