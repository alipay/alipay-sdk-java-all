package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金管控场景中，资金转账明细
 *
 * @author auto create
 * @since 1.0, 2023-12-26 16:22:34
 */
public class SupvFundTransferDetail extends AlipayObject {

	private static final long serialVersionUID = 3444979134911781997L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 状态描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 发生时间
	 */
	@ApiField("occurred_time")
	private Date occurredTime;

	/**
	 * 结算单号
	 */
	@ApiField("settle_order_no")
	private String settleOrderNo;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 转账类型
	 */
	@ApiField("transfer_type")
	private String transferType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getOccurredTime() {
		return this.occurredTime;
	}
	public void setOccurredTime(Date occurredTime) {
		this.occurredTime = occurredTime;
	}

	public String getSettleOrderNo() {
		return this.settleOrderNo;
	}
	public void setSettleOrderNo(String settleOrderNo) {
		this.settleOrderNo = settleOrderNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransferType() {
		return this.transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

}
