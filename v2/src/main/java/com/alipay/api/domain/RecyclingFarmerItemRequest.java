package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农户产粮入参信息
 *
 * @author auto create
 * @since 1.0, 2026-04-29 14:58:44
 */
public class RecyclingFarmerItemRequest extends AlipayObject {

	private static final long serialVersionUID = 4187339116369381721L;

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
	private String saleEndDate;

	/**
	 * 产粮售卖开始有效期
	 */
	@ApiField("sale_start_date")
	private String saleStartDate;

	/**
	 * 税收分类编码
	 */
	@ApiField("tax_code")
	private String taxCode;

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
