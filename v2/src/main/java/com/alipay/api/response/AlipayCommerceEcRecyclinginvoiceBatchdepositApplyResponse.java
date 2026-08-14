package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.batchdeposit.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-29 10:52:50
 */
public class AlipayCommerceEcRecyclinginvoiceBatchdepositApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6186196163766576845L;

	/** 
	 * 批次请款单ID
	 */
	@ApiField("batch_deposit_id")
	private String batchDepositId;

	/** 
	 * 待调拨金额（单位：元）
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/** 
	 * 待调拨的订单笔数
	 */
	@ApiField("deposit_count")
	private Long depositCount;

	/** 
	 * 批次调拨状态
	 */
	@ApiField("deposit_status")
	private String depositStatus;

	/** 
	 * 调拨失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 银行支付链接
	 */
	@ApiField("pay_url")
	private String payUrl;

	public void setBatchDepositId(String batchDepositId) {
		this.batchDepositId = batchDepositId;
	}
	public String getBatchDepositId( ) {
		return this.batchDepositId;
	}

	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getDepositAmount( ) {
		return this.depositAmount;
	}

	public void setDepositCount(Long depositCount) {
		this.depositCount = depositCount;
	}
	public Long getDepositCount( ) {
		return this.depositCount;
	}

	public void setDepositStatus(String depositStatus) {
		this.depositStatus = depositStatus;
	}
	public String getDepositStatus( ) {
		return this.depositStatus;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

}
