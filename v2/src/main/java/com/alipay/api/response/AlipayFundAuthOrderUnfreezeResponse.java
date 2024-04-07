package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.order.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-04 12:24:26
 */
public class AlipayFundAuthOrderUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1845968939246128289L;

	/** 
	 * 本次操作解冻的金额，单位为：元（人民币），精确到小数点后两位，取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 本次解冻操作中信用解冻金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/** 
	 * 本次解冻操作中自有资金解冻金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("fund_amount")
	private String fundAmount;

	/** 
	 * 授权资金解冻成功时间，格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 支付宝资金操作流水号
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户的授权资金订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户本次资金操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 资金操作流水的状态
目前支持：SUCCESS：成功
	 */
	@ApiField("status")
	private String status;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	public String getAuthNo( ) {
		return this.authNo;
	}

	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getCreditAmount( ) {
		return this.creditAmount;
	}

	public void setFundAmount(String fundAmount) {
		this.fundAmount = fundAmount;
	}
	public String getFundAmount( ) {
		return this.fundAmount;
	}

	public void setGmtTrans(Date gmtTrans) {
		this.gmtTrans = gmtTrans;
	}
	public Date getGmtTrans( ) {
		return this.gmtTrans;
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

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
