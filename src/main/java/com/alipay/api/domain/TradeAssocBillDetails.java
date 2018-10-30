package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易关联的账单信息
 *
 * @author auto create
 * @since 1.0, 2017-09-08 11:37:41
 */
public class TradeAssocBillDetails extends AlipayObject {

	private static final long serialVersionUID = 6152736962453486358L;

	/**
	 * 明细条目所归属的账期
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 缴费明细项金额
	 */
	@ApiField("bill_entry_amount")
	private String billEntryAmount;

	/**
	 * 用于标识该笔缴费对应的缴费明细项外部编号；如果是预存缴费，则为外部户号
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 缴费明细项类型
	 */
	@ApiField("cost_type")
	private String costType;

	public String getAcctPeriod() {
		return this.acctPeriod;
	}
	public void setAcctPeriod(String acctPeriod) {
		this.acctPeriod = acctPeriod;
	}

	public String getBillEntryAmount() {
		return this.billEntryAmount;
	}
	public void setBillEntryAmount(String billEntryAmount) {
		this.billEntryAmount = billEntryAmount;
	}

	public String getBillEntryId() {
		return this.billEntryId;
	}
	public void setBillEntryId(String billEntryId) {
		this.billEntryId = billEntryId;
	}

	public String getCostType() {
		return this.costType;
	}
	public void setCostType(String costType) {
		this.costType = costType;
	}

}
