package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-06 16:42:24
 */
public class AlipayEbppIndustrySalaryRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3231542239438359379L;

	/** 
	 * 错误码
	 */
	@ApiField("bank_error_code")
	private String bankErrorCode;

	/** 
	 * 错误描述
	 */
	@ApiField("bank_error_desc")
	private String bankErrorDesc;

	/** 
	 * 聚合收单场景渠道退款单号
	 */
	@ApiField("channel_refund_order_no")
	private String channelRefundOrderNo;

	/** 
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 扩展信息,Map的json序列化后Base64
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 外部退款交易号
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/** 
	 * 商户实际退款金额,单位为分
	 */
	@ApiField("participant_actual_refund_amount")
	private String participantActualRefundAmount;

	/** 
	 * 退款参与方id，如果是代发商户，则填入MerchantId
	 */
	@ApiField("participant_id")
	private String participantId;

	/** 
	 * 退款参与方类型商户
	 */
	@ApiField("participant_type")
	private String participantType;

	/** 
	 * 退款金额。币种同原交易,单位为分
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退款完成时间,YYYYMMDDhhmmss
	 */
	@ApiField("refund_finish_date")
	private String refundFinishDate;

	/** 
	 * 退款网商订单号
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	/** 
	 * 状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

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

	public void setBankErrorCode(String bankErrorCode) {
		this.bankErrorCode = bankErrorCode;
	}
	public String getBankErrorCode( ) {
		return this.bankErrorCode;
	}

	public void setBankErrorDesc(String bankErrorDesc) {
		this.bankErrorDesc = bankErrorDesc;
	}
	public String getBankErrorDesc( ) {
		return this.bankErrorDesc;
	}

	public void setChannelRefundOrderNo(String channelRefundOrderNo) {
		this.channelRefundOrderNo = channelRefundOrderNo;
	}
	public String getChannelRefundOrderNo( ) {
		return this.channelRefundOrderNo;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}
	public String getOutRefundNo( ) {
		return this.outRefundNo;
	}

	public void setParticipantActualRefundAmount(String participantActualRefundAmount) {
		this.participantActualRefundAmount = participantActualRefundAmount;
	}
	public String getParticipantActualRefundAmount( ) {
		return this.participantActualRefundAmount;
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
