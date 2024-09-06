package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品免审更新接口
 *
 * @author auto create
 * @since 1.0, 2024-06-28 17:22:18
 */
public class AlipayOpenAppItemDirectModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4616489754298782936L;

	/**
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。该字段特殊可选，与out_item_id不能同时为空，优先使用item_id。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品原价，分为单位。若填写了skus[]数组，此字段不填写。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商家侧商品ID，要求 APPID 下全局唯一。该字段特殊可选，与item_id不能同时为空，优先使用item_id。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品售价，分为单位。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 商品的售卖状态状态，包含以下两种状态已下架(DELISTING)可售卖(AVAILABLE)
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * sku数组
	 */
	@ApiListField("skus")
	@ApiField("item_direct_modify_sku")
	private List<ItemDirectModifySku> skus;

	/**
	 * 库存
若填写了skus[]数组，此字段不填写。
若未填写skus[]数组，此字段选填。
目前支持库存区间0~99999
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
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

	public List<ItemDirectModifySku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<ItemDirectModifySku> skus) {
		this.skus = skus;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
