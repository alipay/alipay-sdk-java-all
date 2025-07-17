package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车主ETC服务行程退款
 *
 * @author auto create
 * @since 1.0, 2024-06-24 21:33:27
 */
public class AlipayCommerceTransportEtcSettlementRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2174317992378296677L;

	/**
	 * ETC平台协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 行程单id（需要在商户侧唯一）
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 本次需要退款的金额：
1、单位为元；
2、该金额不能大于行程扣款的金额；
3、支持两位小数；
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 本次退款相关的明细列表
	 */
	@ApiListField("refund_item_list")
	@ApiField("e_t_c_refund_item_dto")
	private List<ETCRefundItemDto> refundItemList;

	/**
	 * 退款原因描述：退费
	 */
	@ApiField("refund_reason")
	private String refundReason;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public List<ETCRefundItemDto> getRefundItemList() {
		return this.refundItemList;
	}
	public void setRefundItemList(List<ETCRefundItemDto> refundItemList) {
		this.refundItemList = refundItemList;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

}
