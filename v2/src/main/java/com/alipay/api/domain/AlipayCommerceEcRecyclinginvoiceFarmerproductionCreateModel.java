package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农户产量新增
 *
 * @author auto create
 * @since 1.0, 2026-06-16 16:50:40
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerproductionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4515337182339345784L;

	/**
	 * 农户ID
	 */
	@ApiField("farmer_id")
	private String farmerId;

	/**
	 * 数量
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 有效期止
	 */
	@ApiField("sale_end_date")
	private String saleEndDate;

	/**
	 * 有效期起
	 */
	@ApiField("sale_start_date")
	private String saleStartDate;

	/**
	 * 产品税收编码
	 */
	@ApiField("tax_code")
	private String taxCode;

	public String getFarmerId() {
		return this.farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}

	public String getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemUnit() {
		return this.itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getSaleEndDate() {
		return this.saleEndDate;
	}
	public void setSaleEndDate(String saleEndDate) {
		this.saleEndDate = saleEndDate;
	}

	public String getSaleStartDate() {
		return this.saleStartDate;
	}
	public void setSaleStartDate(String saleStartDate) {
		this.saleStartDate = saleStartDate;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

}
