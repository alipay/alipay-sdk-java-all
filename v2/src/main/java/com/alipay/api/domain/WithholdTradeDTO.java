package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣任务交易
 *
 * @author auto create
 * @since 1.0, 2024-12-12 16:21:36
 */
public class WithholdTradeDTO extends AlipayObject {

	private static final long serialVersionUID = 1492932972596811356L;

	/**
	 * 业务受理平台业务28位订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 扣款金额，单位为分
	 */
	@ApiField("deduct_amount")
	private Long deductAmount;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Long getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(Long deductAmount) {
		this.deductAmount = deductAmount;
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
