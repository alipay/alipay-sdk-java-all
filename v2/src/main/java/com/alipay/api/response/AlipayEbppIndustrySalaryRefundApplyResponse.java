package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.refund.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-06 16:42:24
 */
public class AlipayEbppIndustrySalaryRefundApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8764992417428976575L;

	/** 
	 * 退款交易号
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/** 
	 * 退款参与方id 
对于代发商户，则填对应的MerchantId
	 */
	@ApiField("participant_id")
	private String participantId;

	/** 
	 * 退款参与方类型
	 */
	@ApiField("participant_type")
	private String participantType;

	/** 
	 * 退款网商订单号
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	/** 
	 * 关联网商订单号
	 */
	@ApiField("relate_order_no")
	private String relateOrderNo;

	/** 
	 * 响应收付通加签的xml，通过base64Encode编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}
	public String getOutRefundNo( ) {
		return this.outRefundNo;
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

	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}
	public String getRefundOrderNo( ) {
		return this.refundOrderNo;
	}

	public void setRelateOrderNo(String relateOrderNo) {
		this.relateOrderNo = relateOrderNo;
	}
	public String getRelateOrderNo( ) {
		return this.relateOrderNo;
	}

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

}
