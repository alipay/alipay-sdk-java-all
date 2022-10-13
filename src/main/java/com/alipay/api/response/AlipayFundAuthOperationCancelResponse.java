package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.operation.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-10 14:03:52
 */
public class AlipayFundAuthOperationCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6329418252244258915L;

	/** 
	 * 本次撤销触发的资金动作
close：关闭冻结明细，无资金解冻
unfreeze：产生了资金解冻
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 支付宝资金授权订单号。
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 支付宝的冻结操作流水号。
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户的授权资金订单号。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户的冻结操作流水号 。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setAction(String action) {
		this.action = action;
	}
	public String getAction( ) {
		return this.action;
	}

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	public String getAuthNo( ) {
		return this.authNo;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getOperationId( ) {
		return this.operationId;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
