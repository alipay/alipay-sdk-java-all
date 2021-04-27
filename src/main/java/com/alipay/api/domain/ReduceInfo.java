package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单优惠信息
 *
 * @author auto create
 * @since 1.0, 2016-11-24 22:26:22
 */
public class ReduceInfo extends AlipayObject {

	private static final long serialVersionUID = 2228862326623613196L;

	/**
	 * 门店品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 消费金额（单位分）
	 */
	@ApiField("consume_amt")
	private String consumeAmt;

	/**
	 * 消费门店名称
	 */
	@ApiField("consume_store_name")
	private String consumeStoreName;

	/**
	 * 消费时间
	 */
	@ApiField("payment_time")
	private String paymentTime;

	/**
	 * 优惠金额（单位分）
	 */
	@ApiField("promo_amt")
	private String promoAmt;

	/**
	 * 用户名（脱敏）
	 */
	@ApiField("user_name")
	private String userName;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getConsumeAmt() {
		return this.consumeAmt;
	}
	public void setConsumeAmt(String consumeAmt) {
		this.consumeAmt = consumeAmt;
	}

	public String getConsumeStoreName() {
		return this.consumeStoreName;
	}
	public void setConsumeStoreName(String consumeStoreName) {
		this.consumeStoreName = consumeStoreName;
	}

	public String getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getPromoAmt() {
		return this.promoAmt;
	}
	public void setPromoAmt(String promoAmt) {
		this.promoAmt = promoAmt;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
