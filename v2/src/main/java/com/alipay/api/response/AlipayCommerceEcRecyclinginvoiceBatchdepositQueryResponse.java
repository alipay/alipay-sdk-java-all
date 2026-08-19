package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BatchDepositOrderOpenResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.batchdeposit.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-29 10:52:50
 */
public class AlipayCommerceEcRecyclinginvoiceBatchdepositQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2877673663543434922L;

	/** 
	 * 批次请款单ID
	 */
	@ApiField("batch_deposit_id")
	private String batchDepositId;

	/** 
	 * 出资银行卡号
	 */
	@ApiField("deposit_account_no")
	private String depositAccountNo;

	/** 
	 * 待调拨金额(单位：元)
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/** 
	 * 出资银行
	 */
	@ApiField("deposit_bank_name")
	private String depositBankName;

	/** 
	 * 待调拨的订单笔数
	 */
	@ApiField("deposit_count")
	private String depositCount;

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
	 * 订单信息列表
	 */
	@ApiListField("order_list")
	@ApiField("batch_deposit_order_open_result")
	private List<BatchDepositOrderOpenResult> orderList;

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

	public void setDepositAccountNo(String depositAccountNo) {
		this.depositAccountNo = depositAccountNo;
	}
	public String getDepositAccountNo( ) {
		return this.depositAccountNo;
	}

	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getDepositAmount( ) {
		return this.depositAmount;
	}

	public void setDepositBankName(String depositBankName) {
		this.depositBankName = depositBankName;
	}
	public String getDepositBankName( ) {
		return this.depositBankName;
	}

	public void setDepositCount(String depositCount) {
		this.depositCount = depositCount;
	}
	public String getDepositCount( ) {
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

	public void setOrderList(List<BatchDepositOrderOpenResult> orderList) {
		this.orderList = orderList;
	}
	public List<BatchDepositOrderOpenResult> getOrderList( ) {
		return this.orderList;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

}
