package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩斯账单模型结果对象
 *
 * @author auto create
 * @since 1.0, 2023-05-09 18:01:38
 */
public class BillResult extends AlipayObject {

	private static final long serialVersionUID = 1139442639575635448L;

	/**
	 * 活动批次
	 */
	@ApiField("activity_batch_no")
	private String activityBatchNo;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 银行清算号16位/31位
	 */
	@ApiField("bank_bill_no")
	private String bankBillNo;

	/**
	 * 银行补贴金额
	 */
	@ApiField("bank_discount_amount")
	private String bankDiscountAmount;

	/**
	 * 交易卡种:[1：借记卡 ,2：信用卡]
	 */
	@ApiField("card_type")
	private Long cardType;

	/**
	 * 优惠名称
	 */
	@ApiField("discount_name")
	private String discountName;

	/**
	 * 原始订单金额，提现金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 交易时间，格式yyyyMMdd
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 交易时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 实际交易金额，提现金额
	 */
	@ApiField("real_pay_amount")
	private String realPayAmount;

	/**
	 * 场景码，摩斯分配
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 二级交易场景
	 */
	@ApiField("sub_scene")
	private String subScene;

	/**
	 * 交易通道标识
	 */
	@ApiField("trade_channel")
	private String tradeChannel;

	public String getActivityBatchNo() {
		return this.activityBatchNo;
	}
	public void setActivityBatchNo(String activityBatchNo) {
		this.activityBatchNo = activityBatchNo;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getBankBillNo() {
		return this.bankBillNo;
	}
	public void setBankBillNo(String bankBillNo) {
		this.bankBillNo = bankBillNo;
	}

	public String getBankDiscountAmount() {
		return this.bankDiscountAmount;
	}
	public void setBankDiscountAmount(String bankDiscountAmount) {
		this.bankDiscountAmount = bankDiscountAmount;
	}

	public Long getCardType() {
		return this.cardType;
	}
	public void setCardType(Long cardType) {
		this.cardType = cardType;
	}

	public String getDiscountName() {
		return this.discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPayDate() {
		return this.payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getRealPayAmount() {
		return this.realPayAmount;
	}
	public void setRealPayAmount(String realPayAmount) {
		this.realPayAmount = realPayAmount;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSubScene() {
		return this.subScene;
	}
	public void setSubScene(String subScene) {
		this.subScene = subScene;
	}

	public String getTradeChannel() {
		return this.tradeChannel;
	}
	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

}
