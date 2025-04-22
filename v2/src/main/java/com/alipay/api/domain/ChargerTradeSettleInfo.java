package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新能源行业，充电行业代扣，结算订单详情信息
 *
 * @author auto create
 * @since 1.0, 2025-04-10 12:00:47
 */
public class ChargerTradeSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 8838746237478171986L;

	/**
	 * 垫资状态
	 */
	@ApiField("advance_pay_status")
	private String advancePayStatus;

	/**
	 * 该笔交易的买家付款时间。格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/**
	 * 本次交易用户应付的订单金额。单位为元，精确到小数点后两位
	 */
	@ApiField("pay_amount")
	private String payAmount;

	public String getAdvancePayStatus() {
		return this.advancePayStatus;
	}
	public void setAdvancePayStatus(String advancePayStatus) {
		this.advancePayStatus = advancePayStatus;
	}

	public Date getGmtPayment() {
		return this.gmtPayment;
	}
	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

}
