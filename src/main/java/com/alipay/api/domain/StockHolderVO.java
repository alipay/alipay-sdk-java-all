package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 股东信息
 *
 * @author auto create
 * @since 1.0, 2019-01-22 14:30:03
 */
public class StockHolderVO extends AlipayObject {

	private static final long serialVersionUID = 5637563437952474562L;

	/**
	 * 出资日期
	 */
	@ApiField("invest_date")
	private String investDate;

	/**
	 * 出资比例(%)
	 */
	@ApiField("invest_rate")
	private String investRate;

	/**
	 * 股东名称
	 */
	@ApiField("org_holder_name")
	private String orgHolderName;

	/**
	 * 股东类型
	 */
	@ApiField("org_holder_type")
	private String orgHolderType;

	/**
	 * 认缴额（万）
	 */
	@ApiField("subscript_amt")
	private String subscriptAmt;

	/**
	 * 币种
	 */
	@ApiField("subscript_amt_curcy")
	private String subscriptAmtCurcy;

	public String getInvestDate() {
		return this.investDate;
	}
	public void setInvestDate(String investDate) {
		this.investDate = investDate;
	}

	public String getInvestRate() {
		return this.investRate;
	}
	public void setInvestRate(String investRate) {
		this.investRate = investRate;
	}

	public String getOrgHolderName() {
		return this.orgHolderName;
	}
	public void setOrgHolderName(String orgHolderName) {
		this.orgHolderName = orgHolderName;
	}

	public String getOrgHolderType() {
		return this.orgHolderType;
	}
	public void setOrgHolderType(String orgHolderType) {
		this.orgHolderType = orgHolderType;
	}

	public String getSubscriptAmt() {
		return this.subscriptAmt;
	}
	public void setSubscriptAmt(String subscriptAmt) {
		this.subscriptAmt = subscriptAmt;
	}

	public String getSubscriptAmtCurcy() {
		return this.subscriptAmtCurcy;
	}
	public void setSubscriptAmtCurcy(String subscriptAmtCurcy) {
		this.subscriptAmtCurcy = subscriptAmtCurcy;
	}

}
