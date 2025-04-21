package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询售卖订单结果
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:39:21
 */
public class CardOrderBatchQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 3418126683923751752L;

	/**
	 * 售卖订单的余额面额，单位分
	 */
	@ApiField("available_amount")
	private Long availableAmount;

	/**
	 * 安心付绑卡信息
	 */
	@ApiField("axf_card_bind_info")
	private AxfCardBindInfo axfCardBindInfo;

	/**
	 * 用于区分订购单的取消类型
	 */
	@ApiField("cancel_type")
	private String cancelType;

	/**
	 * 已解约金额，单位：分
	 */
	@ApiField("cancelled_cash")
	private Long cancelledCash;

	/**
	 * 售卖订单ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * （1）TIMES_CARD / PERIOD_PAY / AXF_MERCHANT_PERIOD_PAY / AXF_MERCHANT_PERIOD_PAY_INDIRECT： init、available、used_up、closing、closed、pause （2）AXF_MONEY_CARD：available、invalid、paid、refund、timeout_closed、used_up （3）AXF_MONEY_TIME_CARD：wait_pay、paid、available、timeout_closed、used_up、invalid、closing
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 卡ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/**
	 * 违约金比例
	 */
	@ApiField("damages_rate")
	private String damagesRate;

	/**
	 * 违约金类型
	 */
	@ApiField("damages_type")
	private String damagesType;

	/**
	 * 追回优惠金额，包含退款金额，单位：分
	 */
	@ApiField("discount_cash")
	private Long discountCash;

	/**
	 * 计划追回优惠金额，单位：分
	 */
	@ApiField("discount_plan_cash")
	private Long discountPlanCash;

	/**
	 * 追回金额--已退金额，单位：分
	 */
	@ApiField("discount_refund_cash")
	private Long discountRefundCash;

	/**
	 * 资金模式
	 */
	@ApiField("funding_model")
	private String fundingModel;

	/**
	 * 订单有效期开始时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 订单有效期结束时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 购卡时的卡名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 用户购卡时的卡原价，单位分
	 */
	@ApiField("origin_price_total")
	private Long originPriceTotal;

	/**
	 * 商户在跳转购卡页时的自定义外部单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 退款金额，单位：分
	 */
	@ApiField("refund_cash")
	private Long refundCash;

	/**
	 * 剩余期数(次数)
	 */
	@ApiField("remain_count")
	private Long remainCount;

	/**
	 * 用户购卡时的卡售价，单位分
	 */
	@ApiField("sale_price_total")
	private Long salePriceTotal;

	/**
	 * 购卡时的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 总期数(次数)
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * （1）金额卡余额现金价值，单位分
（2）周期卡未核销金额
	 */
	@ApiField("usable_cash")
	private Long usableCash;

	/**
	 * 已核销金额，单位：分
	 */
	@ApiField("used_cash")
	private Long usedCash;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 脱敏后的用户名称
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户电话，用户授权后才有值
	 */
	@ApiField("user_phone")
	private String userPhone;

	public Long getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(Long availableAmount) {
		this.availableAmount = availableAmount;
	}

	public AxfCardBindInfo getAxfCardBindInfo() {
		return this.axfCardBindInfo;
	}
	public void setAxfCardBindInfo(AxfCardBindInfo axfCardBindInfo) {
		this.axfCardBindInfo = axfCardBindInfo;
	}

	public String getCancelType() {
		return this.cancelType;
	}
	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}

	public Long getCancelledCash() {
		return this.cancelledCash;
	}
	public void setCancelledCash(Long cancelledCash) {
		this.cancelledCash = cancelledCash;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDamagesRate() {
		return this.damagesRate;
	}
	public void setDamagesRate(String damagesRate) {
		this.damagesRate = damagesRate;
	}

	public String getDamagesType() {
		return this.damagesType;
	}
	public void setDamagesType(String damagesType) {
		this.damagesType = damagesType;
	}

	public Long getDiscountCash() {
		return this.discountCash;
	}
	public void setDiscountCash(Long discountCash) {
		this.discountCash = discountCash;
	}

	public Long getDiscountPlanCash() {
		return this.discountPlanCash;
	}
	public void setDiscountPlanCash(Long discountPlanCash) {
		this.discountPlanCash = discountPlanCash;
	}

	public Long getDiscountRefundCash() {
		return this.discountRefundCash;
	}
	public void setDiscountRefundCash(Long discountRefundCash) {
		this.discountRefundCash = discountRefundCash;
	}

	public String getFundingModel() {
		return this.fundingModel;
	}
	public void setFundingModel(String fundingModel) {
		this.fundingModel = fundingModel;
	}

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getOriginPriceTotal() {
		return this.originPriceTotal;
	}
	public void setOriginPriceTotal(Long originPriceTotal) {
		this.originPriceTotal = originPriceTotal;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Long getRefundCash() {
		return this.refundCash;
	}
	public void setRefundCash(Long refundCash) {
		this.refundCash = refundCash;
	}

	public Long getRemainCount() {
		return this.remainCount;
	}
	public void setRemainCount(Long remainCount) {
		this.remainCount = remainCount;
	}

	public Long getSalePriceTotal() {
		return this.salePriceTotal;
	}
	public void setSalePriceTotal(Long salePriceTotal) {
		this.salePriceTotal = salePriceTotal;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Long getUsableCash() {
		return this.usableCash;
	}
	public void setUsableCash(Long usableCash) {
		this.usableCash = usableCash;
	}

	public Long getUsedCash() {
		return this.usedCash;
	}
	public void setUsedCash(Long usedCash) {
		this.usedCash = usedCash;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
