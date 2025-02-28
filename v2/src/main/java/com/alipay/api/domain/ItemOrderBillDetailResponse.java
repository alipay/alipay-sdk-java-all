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
 * @since 1.0, 2024-07-30 16:24:50
 */
public class ItemOrderBillDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 2198287883837521681L;

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
	 * 花呗分期服务费（卖家贴息），单位：元，精确到小数点后两位
	 */
	@ApiField("huabei_technical_service_fee")
	private String huabeiTechnicalServiceFee;

	/**
	 * 服务商佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("isv_alloc_amount")
	private String isvAllocAmount;

	/**
	 * 服务商名称
	 */
	@ApiField("isv_name")
	private String isvName;

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
	 * 支付手续费，单位：元，精确到小数点后两位
	 */
	@ApiField("pay_commission")
	private String payCommission;

	/**
	 * CPS技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("platform_service")
	private String platformService;

	/**
	 * 退CPS技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("platform_service_refund")
	private String platformServiceRefund;

	/**
	 * 支付前优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_promotion")
	private String prePromotion;

	/**
	 * 订单预计结算时间，用户支付后确认收货前告知账期的天数，  表述为确认收货后X天结算；用户确认收货后，表述为预计时间格式为yyyy-MM-dd
	 */
	@ApiField("predict_settle_time")
	private String predictSettleTime;

	/**
	 * 达人佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("public_alloc_amount")
	private String publicAllocAmount;

	/**
	 * 达人昵称
	 */
	@ApiField("public_name")
	private String publicName;

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
	 * 退服务商佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_isv_alloc_amount")
	private String refundIsvAllocAmount;

	/**
	 * 退支付手续费，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_pay_commission")
	private String refundPayCommission;

	/**
	 * 退达人佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_public_alloc_amount")
	private String refundPublicAllocAmount;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 资金提供方为租赁商提供货品采购资金，帮助租赁商扩大经营规模，因此资方收取部分佣金，单位：元，精确到小数点后两位。
	 */
	@ApiField("rent_funder_commission_amount")
	private String rentFunderCommissionAmount;

	/**
	 * 租赁资方昵称
	 */
	@ApiField("rent_funder_nick_name")
	private String rentFunderNickName;

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
	 * 平台子单号
	 */
	@ApiField("sub_biz_no")
	private String subBizNo;

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

	public String getHuabeiTechnicalServiceFee() {
		return this.huabeiTechnicalServiceFee;
	}
	public void setHuabeiTechnicalServiceFee(String huabeiTechnicalServiceFee) {
		this.huabeiTechnicalServiceFee = huabeiTechnicalServiceFee;
	}

	public String getIsvAllocAmount() {
		return this.isvAllocAmount;
	}
	public void setIsvAllocAmount(String isvAllocAmount) {
		this.isvAllocAmount = isvAllocAmount;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
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

	public String getPayCommission() {
		return this.payCommission;
	}
	public void setPayCommission(String payCommission) {
		this.payCommission = payCommission;
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

	public String getPublicAllocAmount() {
		return this.publicAllocAmount;
	}
	public void setPublicAllocAmount(String publicAllocAmount) {
		this.publicAllocAmount = publicAllocAmount;
	}

	public String getPublicName() {
		return this.publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
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

	public String getRefundIsvAllocAmount() {
		return this.refundIsvAllocAmount;
	}
	public void setRefundIsvAllocAmount(String refundIsvAllocAmount) {
		this.refundIsvAllocAmount = refundIsvAllocAmount;
	}

	public String getRefundPayCommission() {
		return this.refundPayCommission;
	}
	public void setRefundPayCommission(String refundPayCommission) {
		this.refundPayCommission = refundPayCommission;
	}

	public String getRefundPublicAllocAmount() {
		return this.refundPublicAllocAmount;
	}
	public void setRefundPublicAllocAmount(String refundPublicAllocAmount) {
		this.refundPublicAllocAmount = refundPublicAllocAmount;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRentFunderCommissionAmount() {
		return this.rentFunderCommissionAmount;
	}
	public void setRentFunderCommissionAmount(String rentFunderCommissionAmount) {
		this.rentFunderCommissionAmount = rentFunderCommissionAmount;
	}

	public String getRentFunderNickName() {
		return this.rentFunderNickName;
	}
	public void setRentFunderNickName(String rentFunderNickName) {
		this.rentFunderNickName = rentFunderNickName;
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

	public String getSubBizNo() {
		return this.subBizNo;
	}
	public void setSubBizNo(String subBizNo) {
		this.subBizNo = subBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
