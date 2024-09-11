package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 续租交易信息列表
 *
 * @author auto create
 * @since 1.0, 2023-09-06 16:46:09
 */
public class AddRentTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 7614893794554616983L;

	/**
	 * 支付金额，单位分
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
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

}
