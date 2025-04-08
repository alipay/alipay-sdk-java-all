package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付信息
 *
 * @author auto create
 * @since 1.0, 2025-03-31 14:57:55
 */
public class PaymentVO extends AlipayObject {

	private static final long serialVersionUID = 5583312856229186668L;

	/**
	 * 订单优惠总金额
	 */
	@ApiField("amount_discount")
	private String amountDiscount;

	/**
	 * 商品总金额
	 */
	@ApiField("amount_item")
	private String amountItem;

	/**
	 * 订单总金额
	 */
	@ApiField("amount_original")
	private String amountOriginal;

	/**
	 * 用户实付金额
	 */
	@ApiField("amount_user")
	private String amountUser;

	/**
	 * 配送优惠金额
	 */
	@ApiField("delivery_discount_fee")
	private String deliveryDiscountFee;

	/**
	 * 配送服务费，当前订单产生时该门店的配送费，配送服务费=基础配送费+特殊时段加价费用+距离加价费用-配送优惠金额，单位：元，保留2位小数
	 */
	@ApiField("delivery_fee")
	private String deliveryFee;

	/**
	 * 基础配送费，单位：元，保留2位小数
	 */
	@ApiField("delivery_price")
	private String deliveryPrice;

	/**
	 * 距离加价费用，单位：元，保留2位小数
	 */
	@ApiField("distance_markup_price")
	private String distanceMarkupPrice;

	/**
	 * 商家应收款
	 */
	@ApiField("merchant_receive")
	private String merchantReceive;

	/**
	 * 医保支付金额
	 */
	@ApiField("mi_amount")
	private String miAmount;

	/**
	 * 打包费总金额，单位：元，保留2位小数
	 */
	@ApiField("packing_fee")
	private String packingFee;

	/**
	 * 购药saas平台支付单号，对应医保对账单中的平台订单号
	 */
	@ApiField("pay_num")
	private String payNum;

	/**
	 * 特殊时段加价费用，单位：元，保留2位小数
	 */
	@ApiField("time_markup_price")
	private String timeMarkupPrice;

	/**
	 * 此字段对应B站对账单中的商家订单号
	 */
	@ApiField("yk_pay_no")
	private String ykPayNo;

	public String getAmountDiscount() {
		return this.amountDiscount;
	}
	public void setAmountDiscount(String amountDiscount) {
		this.amountDiscount = amountDiscount;
	}

	public String getAmountItem() {
		return this.amountItem;
	}
	public void setAmountItem(String amountItem) {
		this.amountItem = amountItem;
	}

	public String getAmountOriginal() {
		return this.amountOriginal;
	}
	public void setAmountOriginal(String amountOriginal) {
		this.amountOriginal = amountOriginal;
	}

	public String getAmountUser() {
		return this.amountUser;
	}
	public void setAmountUser(String amountUser) {
		this.amountUser = amountUser;
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

	public String getMerchantReceive() {
		return this.merchantReceive;
	}
	public void setMerchantReceive(String merchantReceive) {
		this.merchantReceive = merchantReceive;
	}

	public String getMiAmount() {
		return this.miAmount;
	}
	public void setMiAmount(String miAmount) {
		this.miAmount = miAmount;
	}

	public String getPackingFee() {
		return this.packingFee;
	}
	public void setPackingFee(String packingFee) {
		this.packingFee = packingFee;
	}

	public String getPayNum() {
		return this.payNum;
	}
	public void setPayNum(String payNum) {
		this.payNum = payNum;
	}

	public String getTimeMarkupPrice() {
		return this.timeMarkupPrice;
	}
	public void setTimeMarkupPrice(String timeMarkupPrice) {
		this.timeMarkupPrice = timeMarkupPrice;
	}

	public String getYkPayNo() {
		return this.ykPayNo;
	}
	public void setYkPayNo(String ykPayNo) {
		this.ykPayNo = ykPayNo;
	}

}
