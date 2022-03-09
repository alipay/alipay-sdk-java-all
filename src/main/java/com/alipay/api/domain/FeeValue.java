package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费率模型
 *
 * @author auto create
 * @since 1.0, 2018-07-13 14:09:58
 */
public class FeeValue extends AlipayObject {

	private static final long serialVersionUID = 7251689885128282875L;

	/**
	 * 保底费率
	 */
	@ApiField("bottom_cent")
	private String bottomCent;

	/**
	 * 币种（如人民币是156）
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 固定费额
	 */
	@ApiField("fix_cent")
	private String fixCent;

	/**
	 * 最小费率
	 */
	@ApiField("lower")
	private String lower;

	/**
	 * 费率比例单位。
ONE("RO", "ONE", "一", "一"),
ONE_HUNDREDTH("RP", "ONE_HUNDREDTH", "百分之一", "百分之一"),
ONE_THOUSANDTH("RM", "ONE_THOUSANDTH", "千分之一", "千分之一"),
ONE_TEN_THOUSANDTH("RT", "ONE_TEN_THOUSANDTH", "万分之一", "万分之一");
	 */
	@ApiField("rate_unit")
	private String rateUnit;

	/**
	 * 费率值
	 */
	@ApiField("rate_value")
	private String rateValue;

	/**
	 * 封顶费额
	 */
	@ApiField("top_cent")
	private String topCent;

	/**
	 * 最大费率
	 */
	@ApiField("upper")
	private String upper;

	public String getBottomCent() {
		return this.bottomCent;
	}
	public void setBottomCent(String bottomCent) {
		this.bottomCent = bottomCent;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getFixCent() {
		return this.fixCent;
	}
	public void setFixCent(String fixCent) {
		this.fixCent = fixCent;
	}

	public String getLower() {
		return this.lower;
	}
	public void setLower(String lower) {
		this.lower = lower;
	}

	public String getRateUnit() {
		return this.rateUnit;
	}
	public void setRateUnit(String rateUnit) {
		this.rateUnit = rateUnit;
	}

	public String getRateValue() {
		return this.rateValue;
	}
	public void setRateValue(String rateValue) {
		this.rateValue = rateValue;
	}

	public String getTopCent() {
		return this.topCent;
	}
	public void setTopCent(String topCent) {
		this.topCent = topCent;
	}

	public String getUpper() {
		return this.upper;
	}
	public void setUpper(String upper) {
		this.upper = upper;
	}

}
