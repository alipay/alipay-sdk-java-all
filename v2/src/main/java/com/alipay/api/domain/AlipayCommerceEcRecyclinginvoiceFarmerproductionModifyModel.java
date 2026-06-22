package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农户产量修改接口
 *
 * @author auto create
 * @since 1.0, 2026-06-16 16:50:41
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerproductionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4683558539429672391L;

	/**
	 * 产量记录ID
	 */
	@ApiField("farmer_item_id")
	private String farmerItemId;

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
	 * 有效期截止日期
	 */
	@ApiField("sale_end_date")
	private String saleEndDate;

	/**
	 * 有效期起始日期
	 */
	@ApiField("sale_start_date")
	private String saleStartDate;

	public String getFarmerItemId() {
		return this.farmerItemId;
	}
	public void setFarmerItemId(String farmerItemId) {
		this.farmerItemId = farmerItemId;
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

}
