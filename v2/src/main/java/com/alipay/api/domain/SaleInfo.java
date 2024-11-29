package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 销售明细数据
 *
 * @author auto create
 * @since 1.0, 2024-08-12 15:01:25
 */
public class SaleInfo extends AlipayObject {

	private static final long serialVersionUID = 5711264375529865984L;

	/**
	 * 商品数量（件）
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 销售月份
	 */
	@ApiField("month")
	private String month;

	/**
	 * 月销售金额（万元）
	 */
	@ApiField("sales_amount")
	private String salesAmount;

	/**
	 * 月销售金额环比（单位：%）
	 */
	@ApiField("sales_amount_mom")
	private String salesAmountMom;

	/**
	 * 月销售金额同比（单位：%）
	 */
	@ApiField("sales_amount_yoy")
	private String salesAmountYoy;

	/**
	 * 月销量（件）
	 */
	@ApiField("sales_volume")
	private String salesVolume;

	public String getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public String getSalesAmount() {
		return this.salesAmount;
	}
	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}

	public String getSalesAmountMom() {
		return this.salesAmountMom;
	}
	public void setSalesAmountMom(String salesAmountMom) {
		this.salesAmountMom = salesAmountMom;
	}

	public String getSalesAmountYoy() {
		return this.salesAmountYoy;
	}
	public void setSalesAmountYoy(String salesAmountYoy) {
		this.salesAmountYoy = salesAmountYoy;
	}

	public String getSalesVolume() {
		return this.salesVolume;
	}
	public void setSalesVolume(String salesVolume) {
		this.salesVolume = salesVolume;
	}

}
