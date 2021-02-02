package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待圈存的明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class RechargeBill extends AlipayObject {

	private static final long serialVersionUID = 3352682781977735354L;

	/**
	 * 用户充值金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 充值时间：YYYY-MM-DD hh:mm:ss
	 */
	@ApiField("deposit_time")
	private String depositTime;

	/**
	 * Transfer：待圈存
Success：圈存成功
Fail：圈存失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDepositTime() {
		return this.depositTime;
	}
	public void setDepositTime(String depositTime) {
		this.depositTime = depositTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
