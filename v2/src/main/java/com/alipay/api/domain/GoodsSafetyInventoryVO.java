package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货品安全库存信息
 *
 * @author auto create
 * @since 1.0, 2018-09-17 09:54:10
 */
public class GoodsSafetyInventoryVO extends AlipayObject {

	private static final long serialVersionUID = 6887486246821129141L;

	/**
	 * 2018-08-18
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 历史平均每天销售
	 */
	@ApiField("historical_daily_sales")
	private String historicalDailySales;

	/**
	 * 最小购买数量
	 */
	@ApiField("min_order_num")
	private String minOrderNum;

	/**
	 * 采购周期
	 */
	@ApiField("purchase_cycle")
	private String purchaseCycle;

	/**
	 * 安全库存
	 */
	@ApiField("safety_inventory")
	private String safetyInventory;

	/**
	 * 目标库存
	 */
	@ApiField("target_inventory")
	private String targetInventory;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getHistoricalDailySales() {
		return this.historicalDailySales;
	}
	public void setHistoricalDailySales(String historicalDailySales) {
		this.historicalDailySales = historicalDailySales;
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
