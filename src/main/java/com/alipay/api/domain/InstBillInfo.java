package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单数据
 *
 * @author auto create
 * @since 1.0, 2022-06-17 17:00:23
 */
public class InstBillInfo extends AlipayObject {

	private static final long serialVersionUID = 1687576265669321265L;

	/**
	 * 账户余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 欠费金额
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单id，创单时使用
	 */
	@ApiField("bill_id")
	private String billId;

	/**
	 * 缓存key，创单时使用
	 */
	@ApiField("cache_key")
	private String cacheKey;

	/**
	 * 缴费类型
预付费：PRE_PAY
后付费自由缴：POST_PAY_FREE_CHARGE
后付费缴清：POST_PAY_CLEAR_CHARGE
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 滞纳金
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillId() {
		return this.billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getCacheKey() {
		return this.cacheKey;
	}
	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getFineAmount() {
		return this.fineAmount;
	}
	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

}
