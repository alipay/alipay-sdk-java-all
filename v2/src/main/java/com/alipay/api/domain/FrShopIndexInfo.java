package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法人维度店铺指标数据
 *
 * @author auto create
 * @since 1.0, 2025-02-08 10:59:21
 */
public class FrShopIndexInfo extends AlipayObject {

	private static final long serialVersionUID = 8274836243813298882L;

	/**
	 * 数据月份
	 */
	@ApiField("month")
	private String month;

	/**
	 * 含数据月份在内的商家过去12个月销售金额(万元)
	 */
	@ApiField("sales_amount_12_m")
	private String salesAmount12M;

	/**
	 * 商家当月销售金额(万元)
	 */
	@ApiField("sales_amount_1_m")
	private String salesAmount1M;

	/**
	 * 含数据月份在内的商家过去3个月销售金额(万元)
	 */
	@ApiField("sales_amount_3_m")
	private String salesAmount3M;

	/**
	 * 含数据月份在内的商家过去6个月销售金额(万元)
	 */
	@ApiField("sales_amount_6_m")
	private String salesAmount6M;

	/**
	 * 商家月销售金额环比(%)
	 */
	@ApiField("sales_amount_mom")
	private String salesAmountMom;

	/**
	 * 历史12个月月销售金额环比(%)
	 */
	@ApiField("sales_amount_p_12_m_mom")
	private String salesAmountP12MMom;

	/**
	 * 历史12个月月销售金额同比(%)
	 */
	@ApiField("sales_amount_p_12_m_yoy")
	private String salesAmountP12MYoy;

	/**
	 * 历史3个月月销售金额环比(%)
	 */
	@ApiField("sales_amount_p_3_m_mom")
	private String salesAmountP3MMom;

	/**
	 * 历史3个月月销售金额同比(%)
	 */
	@ApiField("sales_amount_p_3_m_yoy")
	private String salesAmountP3MYoy;

	/**
	 * 历史6个月月销售金额环比(%)
	 */
	@ApiField("sales_amount_p_6_m_mom")
	private String salesAmountP6MMom;

	/**
	 * 历史6个月月销售金额同比(%)
	 */
	@ApiField("sales_amount_p_6_m_yoy")
	private String salesAmountP6MYoy;

	/**
	 * 商家月销售金额同比(%)
	 */
	@ApiField("sales_amount_yoy")
	private String salesAmountYoy;

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public String getSalesAmount12M() {
		return this.salesAmount12M;
	}
	public void setSalesAmount12M(String salesAmount12M) {
		this.salesAmount12M = salesAmount12M;
	}

	public String getSalesAmount1M() {
		return this.salesAmount1M;
	}
	public void setSalesAmount1M(String salesAmount1M) {
		this.salesAmount1M = salesAmount1M;
	}

	public String getSalesAmount3M() {
		return this.salesAmount3M;
	}
	public void setSalesAmount3M(String salesAmount3M) {
		this.salesAmount3M = salesAmount3M;
	}

	public String getSalesAmount6M() {
		return this.salesAmount6M;
	}
	public void setSalesAmount6M(String salesAmount6M) {
		this.salesAmount6M = salesAmount6M;
	}

	public String getSalesAmountMom() {
		return this.salesAmountMom;
	}
	public void setSalesAmountMom(String salesAmountMom) {
		this.salesAmountMom = salesAmountMom;
	}

	public String getSalesAmountP12MMom() {
		return this.salesAmountP12MMom;
	}
	public void setSalesAmountP12MMom(String salesAmountP12MMom) {
		this.salesAmountP12MMom = salesAmountP12MMom;
	}

	public String getSalesAmountP12MYoy() {
		return this.salesAmountP12MYoy;
	}
	public void setSalesAmountP12MYoy(String salesAmountP12MYoy) {
		this.salesAmountP12MYoy = salesAmountP12MYoy;
	}

	public String getSalesAmountP3MMom() {
		return this.salesAmountP3MMom;
	}
	public void setSalesAmountP3MMom(String salesAmountP3MMom) {
		this.salesAmountP3MMom = salesAmountP3MMom;
	}

	public String getSalesAmountP3MYoy() {
		return this.salesAmountP3MYoy;
	}
	public void setSalesAmountP3MYoy(String salesAmountP3MYoy) {
		this.salesAmountP3MYoy = salesAmountP3MYoy;
	}

	public String getSalesAmountP6MMom() {
		return this.salesAmountP6MMom;
	}
	public void setSalesAmountP6MMom(String salesAmountP6MMom) {
		this.salesAmountP6MMom = salesAmountP6MMom;
	}

	public String getSalesAmountP6MYoy() {
		return this.salesAmountP6MYoy;
	}
	public void setSalesAmountP6MYoy(String salesAmountP6MYoy) {
		this.salesAmountP6MYoy = salesAmountP6MYoy;
	}

	public String getSalesAmountYoy() {
		return this.salesAmountYoy;
	}
	public void setSalesAmountYoy(String salesAmountYoy) {
		this.salesAmountYoy = salesAmountYoy;
	}

}
