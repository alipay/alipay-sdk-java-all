package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单还款的交易详情
 *
 * @author auto create
 * @since 1.0, 2019-11-25 20:58:35
 */
public class RepayTradeDetail extends AlipayObject {

	private static final long serialVersionUID = 3538587496861197866L;

	/**
	 * 交易还款金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("repay_amount")
	private String repayAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getRepayAmount() {
		return this.repayAmount;
	}
	public void setRepayAmount(String repayAmount) {
		this.repayAmount = repayAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
