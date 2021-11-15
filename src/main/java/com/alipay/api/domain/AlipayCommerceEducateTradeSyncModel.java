package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV回流订单状态更新接口
 *
 * @author auto create
 * @since 1.0, 2021-03-16 21:44:31
 */
public class AlipayCommerceEducateTradeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3582552687889893785L;

	/**
	 * 教育账单编号
	 */
	@ApiField("edu_trade_no")
	private String eduTradeNo;

	/**
	 * 1
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 实际支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 实际支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易状态：1-等待支付；2-超时关闭；3-支付成功；4-交易结束（不可退款）;5-已退款
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public String getEduTradeNo() {
		return this.eduTradeNo;
	}
	public void setEduTradeNo(String eduTradeNo) {
		this.eduTradeNo = eduTradeNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

}
