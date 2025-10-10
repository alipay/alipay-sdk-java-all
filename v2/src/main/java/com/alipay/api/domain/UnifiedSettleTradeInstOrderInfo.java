package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收结易来账明细单信息
 *
 * @author auto create
 * @since 1.0, 2025-08-12 23:42:33
 */
public class UnifiedSettleTradeInstOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 3362786839513873189L;

	/**
	 * 金额，币种为人民币，单位为元，1.00为一元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务备注，用于展示外部机构传递的备注
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 该明细的创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 该明细的修改时间，比如最新一次的状态变更时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 来账外部机构的流水号，比如银行的流水号
	 */
	@ApiField("inst_serial_no")
	private String instSerialNo;

	/**
	 * 来账单据的单据号，作为主键标识每笔明细
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 付款方的账户名
	 */
	@ApiField("payer_card_name")
	private String payerCardName;

	/**
	 * 付款方的卡号
	 */
	@ApiField("payer_card_no")
	private String payerCardNo;

	/**
	 * 付款方机构/银行ID
	 */
	@ApiField("payer_inst_id")
	private String payerInstId;

	/**
	 * 该明细的状态
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizMemo() {
		return this.bizMemo;
	}
	public void setBizMemo(String bizMemo) {
		this.bizMemo = bizMemo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInstSerialNo() {
		return this.instSerialNo;
	}
	public void setInstSerialNo(String instSerialNo) {
		this.instSerialNo = instSerialNo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayerCardName() {
		return this.payerCardName;
	}
	public void setPayerCardName(String payerCardName) {
		this.payerCardName = payerCardName;
	}

	public String getPayerCardNo() {
		return this.payerCardNo;
	}
	public void setPayerCardNo(String payerCardNo) {
		this.payerCardNo = payerCardNo;
	}

	public String getPayerInstId() {
		return this.payerInstId;
	}
	public void setPayerInstId(String payerInstId) {
		this.payerInstId = payerInstId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
