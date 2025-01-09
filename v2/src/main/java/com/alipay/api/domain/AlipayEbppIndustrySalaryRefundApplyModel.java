package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户来账退回申请
 *
 * @author auto create
 * @since 1.0, 2025-01-06 11:26:22
 */
public class AlipayEbppIndustrySalaryRefundApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7747438214176198591L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 币种，必须同原交易
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
	 * 退款外部交易号
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/**
	 * 代发商户的商户号
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * ParticipantType	收款方类型，即原支付代发商户：MERCHANT
	 */
	@ApiField("participant_type")
	private String participantType;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单退款金额。向渠道退款金额。单位为分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 关联网商订单号
	 */
	@ApiField("relate_order_no")
	private String relateOrderNo;

	/**
	 * 关联网商支付流水号
	 */
	@ApiField("relate_trans_no")
	private String relateTransNo;

	/**
	 * 加签xml
	 */
	@ApiField("sign_xml")
	private String signXml;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutRefundNo() {
		return this.outRefundNo;
	}
	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getParticipantType() {
		return this.participantType;
	}
	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRelateOrderNo() {
		return this.relateOrderNo;
	}
	public void setRelateOrderNo(String relateOrderNo) {
		this.relateOrderNo = relateOrderNo;
	}

	public String getRelateTransNo() {
		return this.relateTransNo;
	}
	public void setRelateTransNo(String relateTransNo) {
		this.relateTransNo = relateTransNo;
	}

	public String getSignXml() {
		return this.signXml;
	}
	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}

}
