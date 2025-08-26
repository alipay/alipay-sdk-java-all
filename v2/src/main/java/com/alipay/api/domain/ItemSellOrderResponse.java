package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询业务账单本地生活商品售卖明细订单列表详情
 *
 * @author auto create
 * @since 1.0, 2024-10-22 17:11:19
 */
public class ItemSellOrderResponse extends AlipayObject {

	private static final long serialVersionUID = 1118944789532274184L;

	/**
	 * cps技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("cps_amount")
	private String cpsAmount;

	/**
	 * 订单创建时间，格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品唯一编号ID
	 */
	@ApiField("item_instance_id")
	private String itemInstanceId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品金额，单位：元，精确到小数点后两位
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商家优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("merchant_discount_amount")
	private String merchantDiscountAmount;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 平台订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单的成交场景，表示订单在哪种场景下成交的
	 */
	@ApiField("order_scene")
	private String orderScene;

	/**
	 * 订单的状态，表示该笔订单目前的一个状态情况。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付手续费，单位：元，精确到小数点后两位
	 */
	@ApiField("pay_commission")
	private String payCommission;

	/**
	 * 支付宝优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("platform_discount_amount")
	private String platformDiscountAmount;

	/**
	 * 预计实收金额，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_receipt_amount")
	private String preReceiptAmount;

	/**
	 * 预计用户实付，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_user_fund_amount")
	private String preUserFundAmount;

	/**
	 * 订单预计结算时间，用户支付后确认收货前告知账期的天数， 表述为确认收货后X天结算；用户确认收货后，表述为预计时间格式为yyyy-MM-dd
	 */
	@ApiField("predict_settle_time")
	private String predictSettleTime;

	/**
	 * 实收金额，单位：元，精确到小数点后两位
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 退CPS技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_cps_amount")
	private String refundCpsAmount;

	/**
	 * 退款金额，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退支付手续费，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_pay_commission")
	private String refundPayCommission;

	/**
	 * 备注信息，包含如虚拟服务权益卡卡号等信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 结算户号/卡号，如果结算类型为支付宝，展示支付宝账号，如果结算类型为银行卡，展示银行卡号
	 */
	@ApiField("settle_account_no")
	private String settleAccountNo;

	/**
	 * 结算账户类型，表示结算的账户是银行卡还是支付宝账号
	 */
	@ApiField("settle_account_type")
	private String settleAccountType;

	/**
	 * 订单结算金额，单位：元，精确到小数点后两位
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 订单结算时间
	 */
	@ApiField("settle_time")
	private Date settleTime;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户实付金额，单位：元，精确到小数点后两位
	 */
	@ApiField("user_fund_amount")
	private String userFundAmount;

	public String getCpsAmount() {
		return this.cpsAmount;
	}
	public void setCpsAmount(String cpsAmount) {
		this.cpsAmount = cpsAmount;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemInstanceId() {
		return this.itemInstanceId;
	}
	public void setItemInstanceId(String itemInstanceId) {
		this.itemInstanceId = itemInstanceId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getMerchantDiscountAmount() {
		return this.merchantDiscountAmount;
	}
	public void setMerchantDiscountAmount(String merchantDiscountAmount) {
		this.merchantDiscountAmount = merchantDiscountAmount;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderScene() {
		return this.orderScene;
	}
	public void setOrderScene(String orderScene) {
		this.orderScene = orderScene;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayCommission() {
		return this.payCommission;
	}
	public void setPayCommission(String payCommission) {
		this.payCommission = payCommission;
	}

	public String getPlatformDiscountAmount() {
		return this.platformDiscountAmount;
	}
	public void setPlatformDiscountAmount(String platformDiscountAmount) {
		this.platformDiscountAmount = platformDiscountAmount;
	}

	public String getPreReceiptAmount() {
		return this.preReceiptAmount;
	}
	public void setPreReceiptAmount(String preReceiptAmount) {
		this.preReceiptAmount = preReceiptAmount;
	}

	public String getPreUserFundAmount() {
		return this.preUserFundAmount;
	}
	public void setPreUserFundAmount(String preUserFundAmount) {
		this.preUserFundAmount = preUserFundAmount;
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

	public String getRefundCpsAmount() {
		return this.refundCpsAmount;
	}
	public void setRefundCpsAmount(String refundCpsAmount) {
		this.refundCpsAmount = refundCpsAmount;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundPayCommission() {
		return this.refundPayCommission;
	}
	public void setRefundPayCommission(String refundPayCommission) {
		this.refundPayCommission = refundPayCommission;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSettleAccountNo() {
		return this.settleAccountNo;
	}
	public void setSettleAccountNo(String settleAccountNo) {
		this.settleAccountNo = settleAccountNo;
	}

	public String getSettleAccountType() {
		return this.settleAccountType;
	}
	public void setSettleAccountType(String settleAccountType) {
		this.settleAccountType = settleAccountType;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public Date getSettleTime() {
		return this.settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserFundAmount() {
		return this.userFundAmount;
	}
	public void setUserFundAmount(String userFundAmount) {
		this.userFundAmount = userFundAmount;
	}

}
