package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.efund.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 23:11:50
 */
public class AlipayTradeSettleEfundUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7869672195351754198L;

	/** 
	 * 实际解冻金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 操作时间
	 */
	@ApiField("operation_time")
	private String operationTime;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 支付宝结算单据号
	 */
	@ApiField("settle_no")
	private String settleNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setOperationTime(String operationTime) {
		this.operationTime = operationTime;
	}
	public String getOperationTime( ) {
		return this.operationTime;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleNo( ) {
		return this.settleNo;
	}

}
