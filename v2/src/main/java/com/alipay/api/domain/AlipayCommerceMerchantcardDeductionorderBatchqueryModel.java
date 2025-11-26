package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款单分页查询
 *
 * @author auto create
 * @since 1.0, 2025-11-20 15:07:20
 */
public class AlipayCommerceMerchantcardDeductionorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1335636914326239512L;

	/**
	 * 售卖订单id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 默认的订单类型范围：TIMES_CARD、PERIOD_PAY、AXF_MERCHANT_PERIOD_PAY、AXF_PERIOD_PAY_INDIRECT
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 核销订单结束时间
	 */
	@ApiField("deduction_end_date")
	private String deductionEndDate;

	/**
	 * 核销订单类型
	 */
	@ApiField("deduction_order_type")
	private String deductionOrderType;

	/**
	 * 核销订单开始时间
	 */
	@ApiField("deduction_start_date")
	private String deductionStartDate;

	/**
	 * （1）TIMES_CARD / PERIOD_PAY / AXF_MERCHANT_PERIOD_PAY / AXF_MERCHANT_PERIOD_PAY_INDIRECT：UNPAID、PAYMENT_SUCCESS、PAYMENT_FAILED、REFUND （2）AXF_MONEY_TIME_CARD：INIT、FROZEN、CANCELLED、REDEEMING、PAYMENT_FAILED、PAYMENT_SUCCESS、REFUND、PART_REFUND
	 */
	@ApiField("deduction_status")
	private String deductionStatus;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 售卖订单结束时间
	 */
	@ApiField("order_end_date")
	private String orderEndDate;

	/**
	 * 售卖订单开始时间
	 */
	@ApiField("order_start_date")
	private String orderStartDate;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getDeductionEndDate() {
		return this.deductionEndDate;
	}
	public void setDeductionEndDate(String deductionEndDate) {
		this.deductionEndDate = deductionEndDate;
	}

	public String getDeductionOrderType() {
		return this.deductionOrderType;
	}
	public void setDeductionOrderType(String deductionOrderType) {
		this.deductionOrderType = deductionOrderType;
	}

	public String getDeductionStartDate() {
		return this.deductionStartDate;
	}
	public void setDeductionStartDate(String deductionStartDate) {
		this.deductionStartDate = deductionStartDate;
	}

	public String getDeductionStatus() {
		return this.deductionStatus;
	}
	public void setDeductionStatus(String deductionStatus) {
		this.deductionStatus = deductionStatus;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderEndDate() {
		return this.orderEndDate;
	}
	public void setOrderEndDate(String orderEndDate) {
		this.orderEndDate = orderEndDate;
	}

	public String getOrderStartDate() {
		return this.orderStartDate;
	}
	public void setOrderStartDate(String orderStartDate) {
		this.orderStartDate = orderStartDate;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
