package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序订单对账明细
 *
 * @author auto create
 * @since 1.0, 2023-06-28 16:58:37
 */
public class ItemOrderBillDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 7683476228379977389L;

	/**
	 * 订单创建时间，格式为  yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 支付宝公域会根据商家的具体成交场景和成交的商品类目来收取一定的技术服务费，技术服务费=结算基数*技术服务费费率，其中费率的部分由商品的类目来计算出。具体详情请查阅：<a href="https://opendocs.alipay.com/b/07w1gp">文档</a>
	 */
	@ApiField("fee_categories")
	private String feeCategories;

	/**
	 * 订单关联小程序应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单名称
	 */
	@ApiField("order_name")
	private String orderName;

	/**
	 * 订单总价，单位：元,精确到小数点后两位
	 */
	@ApiField("order_price")
	private String orderPrice;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 订单支付金额，单位：元，精确到小数点后两位
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 平台技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("platform_service")
	private String platformService;

	/**
	 * 退平台技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("platform_service_refund")
	private String platformServiceRefund;

	/**
	 * 商家前置优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_promotion")
	private String prePromotion;

	/**
	 * 订单预计结算时间，用户支付后确认收货前告知账期的天数，  表述为确认收货后X天结算；用户确认收货后，表述为预计时间格式为yyyy-MM-dd
	 */
	@ApiField("predict_settle_time")
	private String predictSettleTime;

	/**
	 * 订单实收金额，单位：元，精确到小数点后两位
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 退款金额，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款明细列表
	 */
	@ApiListField("refund_fee_list")
	@ApiField("item_order_bill_refund_response")
	private List<ItemOrderBillRefundResponse> refundFeeList;

	/**
	 * 订单二级场景类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 资金结算状态
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * 订单结算数据
	 */
	@ApiField("settle_time")
	private Date settleTime;

	/**
	 * 订单结算金额，单位：元,精确到小数点后两位
	 */
	@ApiField("settlement_amount")
	private String settlementAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getFeeCategories() {
		return this.feeCategories;
	}
	public void setFeeCategories(String feeCategories) {
		this.feeCategories = feeCategories;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return this.orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPlatformService() {
		return this.platformService;
	}
	public void setPlatformService(String platformService) {
		this.platformService = platformService;
	}

	public String getPlatformServiceRefund() {
		return this.platformServiceRefund;
	}
	public void setPlatformServiceRefund(String platformServiceRefund) {
		this.platformServiceRefund = platformServiceRefund;
	}

	public String getPrePromotion() {
		return this.prePromotion;
	}
	public void setPrePromotion(String prePromotion) {
		this.prePromotion = prePromotion;
	}

	public String getPredictSettleTime() {
		return this.predictSettleTime;
	}
	public void setPredictSettleTime(String predictSettleTime) {
		this.predictSettleTime = predictSettleTime;
	}

	public String getReceiptAmount() {
		return this.receiptAmount;
	}
	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public List<ItemOrderBillRefundResponse> getRefundFeeList() {
		return this.refundFeeList;
	}
	public void setRefundFeeList(List<ItemOrderBillRefundResponse> refundFeeList) {
		this.refundFeeList = refundFeeList;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public Date getSettleTime() {
		return this.settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

	public String getSettlementAmount() {
		return this.settlementAmount;
	}
	public void setSettlementAmount(String settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
