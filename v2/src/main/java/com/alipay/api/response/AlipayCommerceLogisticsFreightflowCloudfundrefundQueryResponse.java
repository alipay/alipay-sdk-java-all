package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.cloudfundrefund.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-22 10:24:22
 */
public class AlipayCommerceLogisticsFreightflowCloudfundrefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8519935217462687975L;

	/** 
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 退款付方id，即原支付单收方 
如果是商户，则填入merchantId；
如果是平台，则填入isvOrgId；
如果是子户，则填入子户外标(子户号)
	 */
	@ApiField("participant_id")
	private String participantId;

	/** 
	 * 退款付方类型，即原支付单收方
	 */
	@ApiField("participant_type")
	private String participantType;

	/** 
	 * 退款金额,单位：分
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 发起退款申请时的业务流水号
	 */
	@ApiField("refund_biz_no")
	private String refundBizNo;

	/** 
	 * 错误码,退款失败时透出
	 */
	@ApiField("refund_error_code")
	private String refundErrorCode;

	/** 
	 * 错误描述,退款失败时透出
	 */
	@ApiField("refund_error_desc")
	private String refundErrorDesc;

	/** 
	 * 退款完成时间,格式：YYYYMMDDhhmmss
	 */
	@ApiField("refund_finish_date")
	private String refundFinishDate;

	/** 
	 * 发起退款后银行返回的退款订单号
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	/** 
	 * 退款结果
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}
	public String getParticipantId( ) {
		return this.participantId;
	}

	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}
	public String getParticipantType( ) {
		return this.participantType;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundBizNo(String refundBizNo) {
		this.refundBizNo = refundBizNo;
	}
	public String getRefundBizNo( ) {
		return this.refundBizNo;
	}

	public void setRefundErrorCode(String refundErrorCode) {
		this.refundErrorCode = refundErrorCode;
	}
	public String getRefundErrorCode( ) {
		return this.refundErrorCode;
	}

	public void setRefundErrorDesc(String refundErrorDesc) {
		this.refundErrorDesc = refundErrorDesc;
	}
	public String getRefundErrorDesc( ) {
		return this.refundErrorDesc;
	}

	public void setRefundFinishDate(String refundFinishDate) {
		this.refundFinishDate = refundFinishDate;
	}
	public String getRefundFinishDate( ) {
		return this.refundFinishDate;
	}

	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}
	public String getRefundOrderNo( ) {
		return this.refundOrderNo;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

}
