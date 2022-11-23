package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.settle.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-16 10:11:37
 */
public class ZhimaCreditPeZmgoSettleApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1528377698712141985L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 根据商户传入的轻会员协议结算周期内累计消费数据与支付宝端轻会员协议结算周期内消费数据比对之后，若数据不一致，则会返回对应的异常数据比对结果。
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * Y("Y", "支付成功"),
P("P", "支付中"),
N("N", "支付失败"),
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/** 
	 * 芝麻GO结算时，需要传入的扣款单据号。来源于协议到期通知消息
	 */
	@ApiField("withhold_plan_no")
	private String withholdPlanNo;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}
	public String getSettleStatus( ) {
		return this.settleStatus;
	}

	public void setWithholdPlanNo(String withholdPlanNo) {
		this.withholdPlanNo = withholdPlanNo;
	}
	public String getWithholdPlanNo( ) {
		return this.withholdPlanNo;
	}

}
