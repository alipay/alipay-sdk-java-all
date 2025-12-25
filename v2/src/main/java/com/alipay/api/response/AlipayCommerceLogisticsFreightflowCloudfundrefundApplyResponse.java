package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.cloudfundrefund.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-22 10:27:42
 */
public class AlipayCommerceLogisticsFreightflowCloudfundrefundApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1641337819457389848L;

	/** 
	 * 退款业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * mode为网商银行时：
收银台创单完成后响应参数中的order_no参数值
	 */
	@ApiField("cloud_fund_order_no")
	private String cloudFundOrderNo;

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
	 * 退款申请受理信息
	 */
	@ApiField("refund_apply_msg")
	private String refundApplyMsg;

	/** 
	 * 退款申请受理状态
	 */
	@ApiField("refund_apply_status")
	private String refundApplyStatus;

	/** 
	 * 退款订单号
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCloudFundOrderNo(String cloudFundOrderNo) {
		this.cloudFundOrderNo = cloudFundOrderNo;
	}
	public String getCloudFundOrderNo( ) {
		return this.cloudFundOrderNo;
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

	public void setRefundApplyMsg(String refundApplyMsg) {
		this.refundApplyMsg = refundApplyMsg;
	}
	public String getRefundApplyMsg( ) {
		return this.refundApplyMsg;
	}

	public void setRefundApplyStatus(String refundApplyStatus) {
		this.refundApplyStatus = refundApplyStatus;
	}
	public String getRefundApplyStatus( ) {
		return this.refundApplyStatus;
	}

	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}
	public String getRefundOrderNo( ) {
		return this.refundOrderNo;
	}

}
