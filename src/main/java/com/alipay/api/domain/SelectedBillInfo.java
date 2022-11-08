package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户选中的账单数据
 *
 * @author auto create
 * @since 1.0, 2022-06-17 17:00:37
 */
public class SelectedBillInfo extends AlipayObject {

	private static final long serialVersionUID = 7481555127895331255L;

	/**
	 * 账单id
	 */
	@ApiField("bill_id")
	private String billId;

	/**
	 * 户号
	 */
	@ApiField("billkey")
	private String billkey;

	/**
	 * 缓存key
	 */
	@ApiField("cache_key")
	private String cacheKey;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	public String getBillId() {
		return this.billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getBillkey() {
		return this.billkey;
	}
	public void setBillkey(String billkey) {
		this.billkey = billkey;
	}

	public String getCacheKey() {
		return this.cacheKey;
	}
	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

}
