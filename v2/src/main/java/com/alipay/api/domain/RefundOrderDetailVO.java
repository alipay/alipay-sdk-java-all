package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 在线购药：退款订单详细信息
 *
 * @author auto create
 * @since 1.0, 2024-11-18 21:17:19
 */
public class RefundOrderDetailVO extends AlipayObject {

	private static final long serialVersionUID = 5362211842399569394L;

	/**
	 * 退款总金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商品退款金额，单位：元
	 */
	@ApiField("amount_item")
	private String amountItem;

	/**
	 * 个人自付退款金额，单位：元
	 */
	@ApiField("amount_user")
	private String amountUser;

	/**
	 * 退款申请时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 退款确认时间
	 */
	@ApiField("confirm_time")
	private Date confirmTime;

	/**
	 * 配送优惠金额，单位：元
	 */
	@ApiField("delivery_discount_fee")
	private String deliveryDiscountFee;

	/**
	 * 配送费退款金额，单位：元
	 */
	@ApiField("delivery_fee")
	private String deliveryFee;

	/**
	 * 基础配送费，单位：元
	 */
	@ApiField("delivery_price")
	private String deliveryPrice;

	/**
	 * 距离加价费用，单位：元
	 */
	@ApiField("distance_markup_price")
	private String distanceMarkupPrice;

	/**
	 * 退款图片url，用户在申请退款时上传的退款图片，上限为6张。
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 退款商品集合
	 */
	@ApiListField("items")
	@ApiField("refund_item_v_o")
	private List<RefundItemVO> items;

	/**
	 * 医保信息
	 */
	@ApiField("medicare")
	private MedicareVO medicare;

	/**
	 * 医保退款金额，单位：元
	 */
	@ApiField("mi_amount")
	private String miAmount;

	/**
	 * 退款发起角色:1 用户,2 商户
	 */
	@ApiField("operator_role")
	private String operatorRole;

	/**
	 * 订单创建时生成的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 打包费退款金额，单位：元
	 */
	@ApiField("packing_fee")
	private String packingFee;

	/**
	 * 退款原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 退款原因code
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 退款状态描述
	 */
	@ApiField("refund_msg")
	private String refundMsg;

	/**
	 * 退款订单号，同alipay.commerce.medical.order.refund.changed(订单退款消息推送)的refund_no
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	/**
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 退款类型：1-全额退款；2-部分退款；3-退差价
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 退款拒绝原因描述
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/**
	 * 退款拒绝原因
	 */
	@ApiField("refuse_reason_code")
	private String refuseReasonCode;

	/**
	 * 退款到账时间
	 */
	@ApiField("success_time")
	private Date successTime;

	/**
	 * 特殊时段加价费用，单位：元
	 */
	@ApiField("time_markup_price")
	private String timeMarkupPrice;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmountItem() {
		return this.amountItem;
	}
	public void setAmountItem(String amountItem) {
		this.amountItem = amountItem;
	}

	public String getAmountUser() {
		return this.amountUser;
	}
	public void setAmountUser(String amountUser) {
		this.amountUser = amountUser;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public Date getConfirmTime() {
		return this.confirmTime;
	}
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getDeliveryDiscountFee() {
		return this.deliveryDiscountFee;
	}
	public void setDeliveryDiscountFee(String deliveryDiscountFee) {
		this.deliveryDiscountFee = deliveryDiscountFee;
	}

	public String getDeliveryFee() {
		return this.deliveryFee;
	}
	public void setDeliveryFee(String deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public String getDeliveryPrice() {
		return this.deliveryPrice;
	}
	public void setDeliveryPrice(String deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	public String getDistanceMarkupPrice() {
		return this.distanceMarkupPrice;
	}
	public void setDistanceMarkupPrice(String distanceMarkupPrice) {
		this.distanceMarkupPrice = distanceMarkupPrice;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public List<RefundItemVO> getItems() {
		return this.items;
	}
	public void setItems(List<RefundItemVO> items) {
		this.items = items;
	}

	public MedicareVO getMedicare() {
		return this.medicare;
	}
	public void setMedicare(MedicareVO medicare) {
		this.medicare = medicare;
	}

	public String getMiAmount() {
		return this.miAmount;
	}
	public void setMiAmount(String miAmount) {
		this.miAmount = miAmount;
	}

	public String getOperatorRole() {
		return this.operatorRole;
	}
	public void setOperatorRole(String operatorRole) {
		this.operatorRole = operatorRole;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPackingFee() {
		return this.packingFee;
	}
	public void setPackingFee(String packingFee) {
		this.packingFee = packingFee;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getRefundMsg() {
		return this.refundMsg;
	}
	public void setRefundMsg(String refundMsg) {
		this.refundMsg = refundMsg;
	}

	public String getRefundOrderNo() {
		return this.refundOrderNo;
	}
	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
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

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getRefuseReasonCode() {
		return this.refuseReasonCode;
	}
	public void setRefuseReasonCode(String refuseReasonCode) {
		this.refuseReasonCode = refuseReasonCode;
	}

	public Date getSuccessTime() {
		return this.successTime;
	}
	public void setSuccessTime(Date successTime) {
		this.successTime = successTime;
	}

	public String getTimeMarkupPrice() {
		return this.timeMarkupPrice;
	}
	public void setTimeMarkupPrice(String timeMarkupPrice) {
		this.timeMarkupPrice = timeMarkupPrice;
	}

}
