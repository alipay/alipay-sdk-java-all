package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.prepayment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:07:50
 */
public class MybankCreditSceneprodPrepaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8236461356181655262L;

	/** 
	 * 是否可以提前还款
提前还款试算时必须先判断accept_repay="Y",如果="N"金额字段为空
	 */
	@ApiField("accept_repay")
	private String acceptRepay;

	/** 
	 * 枚举值 a.退车 loanCancel b.机构主动回购 activeRefund c.客户主动结清 repayByCust
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 交易失败明细提示
提前还款结果查询时，如果tradeStatus=FAIL，failReason字段显示提前还款失败原因。
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 提前还款总金额（单位分）
	 */
	@ApiField("prepayment_amt")
	private String prepaymentAmt;

	/** 
	 * 提前还款申请单号
提前还款申请后，如受理成功会返回。其余场景无返回值。
	 */
	@ApiField("prepayment_apply_no")
	private String prepaymentApplyNo;

	/** 
	 * 提前还款利息（单位分）
	 */
	@ApiField("prepayment_int_amt")
	private String prepaymentIntAmt;

	/** 
	 * 提前还款罚金（单位分）
	 */
	@ApiField("prepayment_pen_amt")
	private String prepaymentPenAmt;

	/** 
	 * 提前还款本金(单位分)
	 */
	@ApiField("prepayment_prin_amt")
	private String prepaymentPrinAmt;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * tradeStatus为提前还款结果查询时返回
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setAcceptRepay(String acceptRepay) {
		this.acceptRepay = acceptRepay;
	}
	public String getAcceptRepay( ) {
		return this.acceptRepay;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setPrepaymentAmt(String prepaymentAmt) {
		this.prepaymentAmt = prepaymentAmt;
	}
	public String getPrepaymentAmt( ) {
		return this.prepaymentAmt;
	}

	public void setPrepaymentApplyNo(String prepaymentApplyNo) {
		this.prepaymentApplyNo = prepaymentApplyNo;
	}
	public String getPrepaymentApplyNo( ) {
		return this.prepaymentApplyNo;
	}

	public void setPrepaymentIntAmt(String prepaymentIntAmt) {
		this.prepaymentIntAmt = prepaymentIntAmt;
	}
	public String getPrepaymentIntAmt( ) {
		return this.prepaymentIntAmt;
	}

	public void setPrepaymentPenAmt(String prepaymentPenAmt) {
		this.prepaymentPenAmt = prepaymentPenAmt;
	}
	public String getPrepaymentPenAmt( ) {
		return this.prepaymentPenAmt;
	}

	public void setPrepaymentPrinAmt(String prepaymentPrinAmt) {
		this.prepaymentPrinAmt = prepaymentPrinAmt;
	}
	public String getPrepaymentPrinAmt( ) {
		return this.prepaymentPrinAmt;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
