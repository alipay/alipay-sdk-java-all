package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单金额信息
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:44:42
 */
public class OrderAmountInfo extends AlipayObject {

	private static final long serialVersionUID = 6232687558324869663L;

	/**
	 * 优惠后总金额（支付金额）=订单总金额 - 优惠后总金额 =ItemVO 中优惠总计金额
	 */
	@ApiField("amount_discount")
	private String amountDiscount;

	/**
	 * 商品总金额
	 */
	@ApiField("amount_item")
	private String amountItem;

	/**
	 * 订单总金额，单位：元，精确到小数点后两位。订单总金额 = 商品总金额 + 护士上门费
	 */
	@ApiField("amount_original")
	private String amountOriginal;

	/**
	 * 优惠总金额
	 */
	@ApiField("discount_total")
	private String discountTotal;

	/**
	 * 护士上门费
	 */
	@ApiField("nurse_visit_fee")
	private String nurseVisitFee;

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

	public String getDiscountTotal() {
		return this.discountTotal;
	}
	public void setDiscountTotal(String discountTotal) {
		this.discountTotal = discountTotal;
	}

	public String getNurseVisitFee() {
		return this.nurseVisitFee;
	}
	public void setNurseVisitFee(String nurseVisitFee) {
		this.nurseVisitFee = nurseVisitFee;
	}

}
