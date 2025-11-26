package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 加油商品SKU创建模型
 *
 * @author auto create
 * @since 1.0, 2025-10-10 11:51:54
 */
public class FuelItemSkuCreateInfo extends AlipayObject {

	private static final long serialVersionUID = 8711441297735869839L;

	/**
	 * 成本价，单位：分
	 */
	@ApiField("cost_price")
	private Long costPrice;

	/**
	 * 商品sku扩展
	 */
	@ApiListField("ext_info")
	@ApiField("fuel_item_ext_info")
	private List<FuelItemExtInfo> extInfo;

	/**
	 * 外部SKU ID
	 */
	@ApiField("external_sku_id")
	private String externalSkuId;

	/**
	 * 库存，单位：升
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 国标价，单位：分
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商品实际售价，单位：分
	 */
	@ApiField("price")
	private Long price;

	public Long getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}

	public List<FuelItemExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<FuelItemExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getExternalSkuId() {
		return this.externalSkuId;
	}
	public void setExternalSkuId(String externalSkuId) {
		this.externalSkuId = externalSkuId;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

}
