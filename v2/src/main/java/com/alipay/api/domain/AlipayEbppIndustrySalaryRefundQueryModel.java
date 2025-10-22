package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户来账退回结果查询
 *
 * @author auto create
 * @since 1.0, 2025-01-06 11:25:26
 */
public class AlipayEbppIndustrySalaryRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1129695254833624627L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 退款外部交易号
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/**
	 * 如果是子户汇入，则填入汇入子户外标
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 退款参与方类型 子户汇入（SUBACCOUNT）
	 */
	@ApiField("participant_type")
	private String participantType;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 网商退款订单号
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	/**
	 * 关联网商订单号
	 */
	@ApiField("relate_order_no")
	private String relateOrderNo;

	/**
	 * 对接收付通加签的xml，通过base64Encode编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

	public String getRefundOrderNo() {
		return this.refundOrderNo;
	}
	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}

	public String getRelateOrderNo() {
		return this.relateOrderNo;
	}
	public void setRelateOrderNo(String relateOrderNo) {
		this.relateOrderNo = relateOrderNo;
	}

	public String getSignXml() {
		return this.signXml;
	}
	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}

}
