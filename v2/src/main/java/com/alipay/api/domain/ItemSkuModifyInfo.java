package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品SKU修改模型
 *
 * @author auto create
 * @since 1.0, 2019-09-18 10:41:47
 */
public class ItemSkuModifyInfo extends AlipayObject {

	private static final long serialVersionUID = 3523594224281973628L;

	/**
	 * 成本价，单位分
	 */
	@ApiField("cost_price")
	private Long costPrice;

	/**
	 * SKU扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("item_ext_info")
	private List<ItemExtInfo> extInfo;

	/**
	 * 外部skuId（sku_id不为空时作为普通更新项,sku_id为空时作为更新key,sku_id和该字段同时为空则新增该条数据）
	 */
	@ApiField("external_sku_id")
	private String externalSkuId;

	/**
	 * 库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 标价，单位分
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 售价，单位分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品SKU状态：EFFECT、INVALID
	 */
	@ApiField("status")
	private String status;

	public Long getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}

	public List<ItemExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ItemExtInfo> extInfo) {
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

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
