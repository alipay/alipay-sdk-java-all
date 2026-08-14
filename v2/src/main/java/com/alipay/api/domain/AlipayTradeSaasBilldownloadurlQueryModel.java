package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询saas对账单下载地址
 *
 * @author auto create
 * @since 1.0, 2026-08-03 11:52:51
 */
public class AlipayTradeSaasBilldownloadurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4466636229297416918L;

	/**
	 * 账单日期，格式为 yyyy-MM-dd，且必须早于当前日期。
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单类型。支持银行资金账单、SaaS交易账单、支付宝交易账单和支付宝资金账单。
	 */
	@ApiField("bill_type")
	private String billType;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

}
