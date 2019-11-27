package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子订单信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class SubOrderResponse extends AlipayObject {

	private static final long serialVersionUID = 4129244948934821932L;

	/**
	 * 子订单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 子订单创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 子订单修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 已付金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 付款时间
	 */
	@ApiField("payment_time")
	private String paymentTime;

	/**
	 * 实际金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 子订单编号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	/**
	 * 子订单类型
	 */
	@ApiField("sub_order_type")
	private String subOrderType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

	public String getSubOrderType() {
		return this.subOrderType;
	}
	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}

}
