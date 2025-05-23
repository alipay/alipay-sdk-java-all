package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货品安全库存
 *
 * @author auto create
 * @since 1.0, 2018-09-17 09:54:16
 */
public class GoodsSafetyInventory extends AlipayObject {

	private static final long serialVersionUID = 6311564147692158934L;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 最小采购量
	 */
	@ApiField("min_order_num")
	private String minOrderNum;

	/**
	 * 采购周期（单位天）
	 */
	@ApiField("purchase_cycle")
	private String purchaseCycle;

	/**
	 * 安全库存数量
	 */
	@ApiField("safety_inventory")
	private String safetyInventory;

	/**
	 * 目标库存数量
	 */
	@ApiField("target_inventory")
	private String targetInventory;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getMinOrderNum() {
		return this.minOrderNum;
	}
	public void setMinOrderNum(String minOrderNum) {
		this.minOrderNum = minOrderNum;
	}

	public String getPurchaseCycle() {
		return this.purchaseCycle;
	}
	public void setPurchaseCycle(String purchaseCycle) {
		this.purchaseCycle = purchaseCycle;
	}

	public String getSafetyInventory() {
		return this.safetyInventory;
	}
	public void setSafetyInventory(String safetyInventory) {
		this.safetyInventory = safetyInventory;
	}

	public String getTargetInventory() {
		return this.targetInventory;
	}
	public void setTargetInventory(String targetInventory) {
		this.targetInventory = targetInventory;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
