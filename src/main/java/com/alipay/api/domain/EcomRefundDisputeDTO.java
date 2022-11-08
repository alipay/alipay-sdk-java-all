package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台逆向纠纷单模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:22:13
 */
public class EcomRefundDisputeDTO extends AlipayObject {

	private static final long serialVersionUID = 7711787347287262369L;

	/**
	 * 买家id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家退货物流公司编码
	 */
	@ApiField("buyer_logistic_company_code")
	private String buyerLogisticCompanyCode;

	/**
	 * 买家退货物流公司名称
	 */
	@ApiField("buyer_logistic_company_name")
	private String buyerLogisticCompanyName;

	/**
	 * 买家退货物流单号
	 */
	@ApiField("buyer_logistic_no")
	private String buyerLogisticNo;

	/**
	 * 案件发生时间
	 */
	@ApiField("case_time")
	private Date caseTime;

	/**
	 * 纠纷结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 纠纷时买家对货物的诉求
        ANY(any), 
        REFUND(仅退款),
        REFUND_WITH_GOODS(退货退款),
        EXCHANGE_OR_MAINTAIN(维修换货),
        REPOST(补寄)
	 */
	@ApiField("goods_needs")
	private String goodsNeeds;

	/**
	 * 货物状态
UNSHIPPED(未发货),
    SHIPPED(已发货),
    NOT_RECEIVE_GOORDS(未收到货),
    RECEIVE_GOODS(已收到货),
    RETURN_GOODS(已寄回),
    CONFIRM_GOODS(卖家确认收货)
	 */
	@ApiField("goods_status")
	private String goodsStatus;

	/**
	 * 交易订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 退款原因类型
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 退款原因描述
	 */
	@ApiField("reason_text")
	private String reasonText;

	/**
	 * 买家退款说明
	 */
	@ApiField("refund_desc")
	private String refundDesc;

	/**
	 * 退款纠纷单id
	 */
	@ApiField("refund_dispute_id")
	private String refundDisputeId;

	/**
	 * 退款金额
	 */
	@ApiField("refund_fee")
	private Long refundFee;

	/**
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 退款要求类型 对应dispute_type
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 卖家id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 纠纷发起时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerLogisticCompanyCode() {
		return this.buyerLogisticCompanyCode;
	}
	public void setBuyerLogisticCompanyCode(String buyerLogisticCompanyCode) {
		this.buyerLogisticCompanyCode = buyerLogisticCompanyCode;
	}

	public String getBuyerLogisticCompanyName() {
		return this.buyerLogisticCompanyName;
	}
	public void setBuyerLogisticCompanyName(String buyerLogisticCompanyName) {
		this.buyerLogisticCompanyName = buyerLogisticCompanyName;
	}

	public String getBuyerLogisticNo() {
		return this.buyerLogisticNo;
	}
	public void setBuyerLogisticNo(String buyerLogisticNo) {
		this.buyerLogisticNo = buyerLogisticNo;
	}

	public Date getCaseTime() {
		return this.caseTime;
	}
	public void setCaseTime(Date caseTime) {
		this.caseTime = caseTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getGoodsNeeds() {
		return this.goodsNeeds;
	}
	public void setGoodsNeeds(String goodsNeeds) {
		this.goodsNeeds = goodsNeeds;
	}

	public String getGoodsStatus() {
		return this.goodsStatus;
	}
	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonText() {
		return this.reasonText;
	}
	public void setReasonText(String reasonText) {
		this.reasonText = reasonText;
	}

	public String getRefundDesc() {
		return this.refundDesc;
	}
	public void setRefundDesc(String refundDesc) {
		this.refundDesc = refundDesc;
	}

	public String getRefundDisputeId() {
		return this.refundDisputeId;
	}
	public void setRefundDisputeId(String refundDisputeId) {
		this.refundDisputeId = refundDisputeId;
	}

	public Long getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(Long refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
