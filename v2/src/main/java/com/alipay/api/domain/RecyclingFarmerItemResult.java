package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询农户产粮响应信息
 *
 * @author auto create
 * @since 1.0, 2026-06-16 16:50:43
 */
public class RecyclingFarmerItemResult extends AlipayObject {

	private static final long serialVersionUID = 2671879379361911983L;

	/**
	 * 产粮记录ID
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
	 * 产粮售卖结束有效期
	 */
	@ApiField("sale_end_date")
	private Date saleEndDate;

	/**
	 * 产粮售卖开始有效期
	 */
	@ApiField("sale_start_date")
	private Date saleStartDate;

	/**
	 * 税收分类编码
	 */
	@ApiField("tax_code")
	private String taxCode;

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

	public Date getSaleEndDate() {
		return this.saleEndDate;
	}
	public void setSaleEndDate(Date saleEndDate) {
		this.saleEndDate = saleEndDate;
	}

	public Date getSaleStartDate() {
		return this.saleStartDate;
	}
	public void setSaleStartDate(Date saleStartDate) {
		this.saleStartDate = saleStartDate;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

}
