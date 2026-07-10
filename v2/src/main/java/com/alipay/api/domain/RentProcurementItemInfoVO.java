package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-26 11:17:45
 */
public class RentProcurementItemInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8379841832657317715L;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private String itemCnt;

	/**
	 * 商户侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商户侧商品 skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 货源商品id
	 */
	@ApiField("supplier_item_id")
	private String supplierItemId;

	/**
	 * 货源商品名称
	 */
	@ApiField("supplier_item_name")
	private String supplierItemName;

	/**
	 * 货源商品skuId
	 */
	@ApiField("supplier_sku_id")
	private String supplierSkuId;

	public String getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(String itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getSupplierItemId() {
		return this.supplierItemId;
	}
	public void setSupplierItemId(String supplierItemId) {
		this.supplierItemId = supplierItemId;
	}

	public String getSupplierItemName() {
		return this.supplierItemName;
	}
	public void setSupplierItemName(String supplierItemName) {
		this.supplierItemName = supplierItemName;
	}

	public String getSupplierSkuId() {
		return this.supplierSkuId;
	}
	public void setSupplierSkuId(String supplierSkuId) {
		this.supplierSkuId = supplierSkuId;
	}

}
