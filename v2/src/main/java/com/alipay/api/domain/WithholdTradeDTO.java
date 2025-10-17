package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣任务交易
 *
 * @author auto create
 * @since 1.0, 2024-12-31 11:34:45
 */
public class WithholdTradeDTO extends AlipayObject {

	private static final long serialVersionUID = 2384721938326337957L;

	/**
	 * 业务受理平台业务28位订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 当前交易所扣款的金额
	 */
	@ApiField("deduct")
	private String deduct;

	/**
	 * 扣款金额，单位为分 当前字段已废弃(字段类型变更，不再使用Number)
	 */
	@ApiField("deduct_amount")
	@Deprecated
	private Long deductAmount;

	/**
	 * 扣款成功时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

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

	public String getDeduct() {
		return this.deduct;
	}
	public void setDeduct(String deduct) {
		this.deduct = deduct;
	}

	public Long getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(Long deductAmount) {
		this.deductAmount = deductAmount;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
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
