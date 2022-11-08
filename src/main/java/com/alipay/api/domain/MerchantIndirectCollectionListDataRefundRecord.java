package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款模型
 *
 * @author auto create
 * @since 1.0, 2022-09-16 10:15:28
 */
public class MerchantIndirectCollectionListDataRefundRecord extends AlipayObject {

	private static final long serialVersionUID = 4327245313214213171L;

	/**
	 * 退款金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 原始交易订单号
如有退款 必填
	 */
	@ApiField("origin_order_no")
	private String originOrderNo;

	/**
	 * 退款渠道
ALIPAY	支付宝
WECHAT_PAY	微信支付
UNION_PAY	银联支付
OTHER	其他付款方式
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 退款交易状态
SUCCESS/FAIL
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 退款时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOriginOrderNo() {
		return this.originOrderNo;
	}
	public void setOriginOrderNo(String originOrderNo) {
		this.originOrderNo = originOrderNo;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}
