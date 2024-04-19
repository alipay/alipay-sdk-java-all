package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 本地商品sku修改模型
 *
 * @author auto create
 * @since 1.0, 2024-04-19 11:34:40
 */
public class LocalItemSkuModifyVO extends AlipayObject {

	private static final long serialVersionUID = 6571798153158322266L;

	/**
	 * sku原价，分为单位。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * sku售价，分为单位
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * sku售卖状态
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * sku销售属性列表
	 */
	@ApiListField("sku_attrs")
	@ApiField("item_sku_attr_v_o")
	private List<ItemSkuAttrVO> skuAttrs;

	/**
	 * 支付宝平台侧商品sku的唯一标识
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku库存
	 */
	@ApiField("stock_num")
	private String stockNum;

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public List<ItemSkuAttrVO> getSkuAttrs() {
		return this.skuAttrs;
	}
	public void setSkuAttrs(List<ItemSkuAttrVO> skuAttrs) {
		this.skuAttrs = skuAttrs;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}

}
