package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * PayOffOrderVO 待解付登记薄
 *
 * @author auto create
 * @since 1.0, 2020-06-24 12:05:53
 */
public class PayOffOrderVO extends AlipayObject {

	private static final long serialVersionUID = 3483958112857818911L;

	/**
	 * 金额，单位元，BigDecimal类型
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 币种Code，如USD CNY
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 是否高优先级处理
	 */
	@ApiField("high_priority")
	private Boolean highPriority;

	/**
	 * 待解付资金流水号
唯一键
	 */
	@ApiField("pay_off_no")
	private String payOffNo;

	/**
	 * 待解付登记薄状态
	 */
	@ApiField("status")
	private String status;

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Boolean getHighPriority() {
		return this.highPriority;
	}
	public void setHighPriority(Boolean highPriority) {
		this.highPriority = highPriority;
	}

	public String getPayOffNo() {
		return this.payOffNo;
	}
	public void setPayOffNo(String payOffNo) {
		this.payOffNo = payOffNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
