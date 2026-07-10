package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-10 11:52:45
 */
public class RentTradeFundBillVO extends AlipayObject {

	private static final long serialVersionUID = 8455969275749659993L;

	/**
	 * 该支付工具类型所使用的金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易使用的资金渠道: ALIPAYACCOUNT(支付宝账户)、COUPON(支付宝红包)、POINT(集分宝)、DISCOUNT(折扣券)、PCARD(预付卡)、MCARD(商家储值卡)、MDISCOUNT(商户优惠券)、MCOUPON(商户红包)、BANKCARD(银行卡)、MONEYFUND(余额宝)、VOUCHER（券）、DCEP_ASSET（数字人民币）
	 */
	@ApiField("fund_channel")
	private String fundChannel;

	/**
	 * 渠道实际付款金额。单位：元
	 */
	@ApiField("real_amount")
	private String realAmount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFundChannel() {
		return this.fundChannel;
	}
	public void setFundChannel(String fundChannel) {
		this.fundChannel = fundChannel;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

}
