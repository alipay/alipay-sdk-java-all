package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品库存相关信息
 *
 * @author auto create
 * @since 1.0, 2022-05-18 13:59:39
 */
public class GoodsInventoryDetail extends AlipayObject {

	private static final long serialVersionUID = 4354213948538241783L;

	/**
	 * 商品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 需要操作的库存数量; 当type为ADD类型,则对应库存增加该值,如果type为SUBTRACT则库存减去该值
	 */
	@ApiField("inventory")
	private String inventory;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 操作库存类型枚举, ADD:加库存;  SUBTRACT: 减库存
	 */
	@ApiField("type")
	private String type;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInventory() {
		return this.inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
