package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 仓库库存明细
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:22:50
 */
public class InventoryItem extends AlipayObject {

	private static final long serialVersionUID = 8239989138844526858L;

	/**
	 * 可用库存
	 */
	@ApiField("available_qty")
	private Long availableQty;

	/**
	 * 扩展库存
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 在库库存
	 */
	@ApiField("on_hand_qty")
	private Long onHandQty;

	/**
	 * sku号
	 */
	@ApiField("sku_no")
	private String skuNo;

	/**
	 * 总库存
	 */
	@ApiField("total_qty")
	private Long totalQty;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public Long getAvailableQty() {
		return this.availableQty;
	}
	public void setAvailableQty(Long availableQty) {
		this.availableQty = availableQty;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getOnHandQty() {
		return this.onHandQty;
	}
	public void setOnHandQty(Long onHandQty) {
		this.onHandQty = onHandQty;
	}

	public String getSkuNo() {
		return this.skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}

	public Long getTotalQty() {
		return this.totalQty;
	}
	public void setTotalQty(Long totalQty) {
		this.totalQty = totalQty;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
