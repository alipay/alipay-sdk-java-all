package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单关联发票信息请求
 *
 * @author auto create
 * @since 1.0, 2020-01-09 10:10:08
 */
public class ApInvoiceBillLinkOrderRequest extends AlipayObject {

	private static final long serialVersionUID = 2528655192585722435L;

	/**
	 * 开票金额，金额为null或为0均视为未填关联金额
	 */
	@ApiField("amt")
	private MultiCurrencyMoneyOpenApi amt;

	/**
	 * 日账单选择维度 map
	 */
	@ApiField("daily_bill_dimension")
	private String dailyBillDimension;

	/**
	 * 可开票对账单号
	 */
	@ApiField("monthly_bill_no")
	private String monthlyBillNo;

	public MultiCurrencyMoneyOpenApi getAmt() {
		return this.amt;
	}
	public void setAmt(MultiCurrencyMoneyOpenApi amt) {
		this.amt = amt;
	}

	public String getDailyBillDimension() {
		return this.dailyBillDimension;
	}
	public void setDailyBillDimension(String dailyBillDimension) {
		this.dailyBillDimension = dailyBillDimension;
	}

	public String getMonthlyBillNo() {
		return this.monthlyBillNo;
	}
	public void setMonthlyBillNo(String monthlyBillNo) {
		this.monthlyBillNo = monthlyBillNo;
	}

}
