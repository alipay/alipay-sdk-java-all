package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 销售特征数据
 *
 * @author auto create
 * @since 1.0, 2024-08-12 15:01:53
 */
public class SaleFeatureInfo extends AlipayObject {

	private static final long serialVersionUID = 6683439758325391888L;

	/**
	 * 月销售金额是否大于0 （1：是，0：否）
	 */
	@ApiField("is_sales_amount_a")
	private String isSalesAmountA;

	/**
	 * 月销售金额是否大于1万
	 */
	@ApiField("is_sales_amount_b")
	private String isSalesAmountB;

	/**
	 * 月销售金额是否大于10万
	 */
	@ApiField("is_sales_amount_c")
	private String isSalesAmountC;

	/**
	 * 月销售金额是否大于100万
	 */
	@ApiField("is_sales_amount_d")
	private String isSalesAmountD;

	/**
	 * 月销量是否大于0（1：是，0：否）
	 */
	@ApiField("is_sales_volume_a")
	private String isSalesVolumeA;

	/**
	 * 月销量是否大于10件（1：是，0：否）
	 */
	@ApiField("is_sales_volume_b")
	private String isSalesVolumeB;

	/**
	 * 月销量是否大于100件（1：是，0：否）
	 */
	@ApiField("is_sales_volume_c")
	private String isSalesVolumeC;

	/**
	 * 月销量是否大于1000件（1：是，0：否）
	 */
	@ApiField("is_sales_volume_d")
	private String isSalesVolumeD;

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
	 * 月销售金额环比（单位：%）
	 */
	@ApiField("sales_amount_mom")
	private String salesAmountMom;

	/**
	 * 销售金额同比（单位：%）
	 */
	@ApiField("sales_amount_yoy")
	private String salesAmountYoy;

	public String getIsSalesAmountA() {
		return this.isSalesAmountA;
	}
	public void setIsSalesAmountA(String isSalesAmountA) {
		this.isSalesAmountA = isSalesAmountA;
	}

	public String getIsSalesAmountB() {
		return this.isSalesAmountB;
	}
	public void setIsSalesAmountB(String isSalesAmountB) {
		this.isSalesAmountB = isSalesAmountB;
	}

	public String getIsSalesAmountC() {
		return this.isSalesAmountC;
	}
	public void setIsSalesAmountC(String isSalesAmountC) {
		this.isSalesAmountC = isSalesAmountC;
	}

	public String getIsSalesAmountD() {
		return this.isSalesAmountD;
	}
	public void setIsSalesAmountD(String isSalesAmountD) {
		this.isSalesAmountD = isSalesAmountD;
	}

	public String getIsSalesVolumeA() {
		return this.isSalesVolumeA;
	}
	public void setIsSalesVolumeA(String isSalesVolumeA) {
		this.isSalesVolumeA = isSalesVolumeA;
	}

	public String getIsSalesVolumeB() {
		return this.isSalesVolumeB;
	}
	public void setIsSalesVolumeB(String isSalesVolumeB) {
		this.isSalesVolumeB = isSalesVolumeB;
	}

	public String getIsSalesVolumeC() {
		return this.isSalesVolumeC;
	}
	public void setIsSalesVolumeC(String isSalesVolumeC) {
		this.isSalesVolumeC = isSalesVolumeC;
	}

	public String getIsSalesVolumeD() {
		return this.isSalesVolumeD;
	}
	public void setIsSalesVolumeD(String isSalesVolumeD) {
		this.isSalesVolumeD = isSalesVolumeD;
	}

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

}
