package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款记录模型
 *
 * @author auto create
 * @since 1.0, 2022-09-16 10:16:22
 */
public class MerchantIndirectCollectionListDataTradeRecord extends AlipayObject {

	private static final long serialVersionUID = 7612121276531252342L;

	/**
	 * 交易金额（小数点后两位，单位元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易订单号 (银行侧)
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 付款渠道
ALIPAY	支付宝
WECHAT_PAY	微信支付
UNION_PAY	银联支付
OTHER	其他付款方式
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 交易状态
SUCCESS/FAIL/FEFUND
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 交易时间(按照时间倒排)
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}
