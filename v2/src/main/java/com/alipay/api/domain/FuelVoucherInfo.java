package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加油订单券信息
 *
 * @author auto create
 * @since 1.0, 2024-05-10 11:47:26
 */
public class FuelVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 4448653981464164891L;

	/**
	 * 券归属的活动编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 互斥传:EXCLUSION，叠加传:SUPERPOSE
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 支付宝出资部分的金额 单位分
	 */
	@ApiField("alipay_amount")
	private Long alipayAmount;

	/**
	 * 券的面额 单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 商家出资的金额 单位分
	 */
	@ApiField("merchant_amount")
	private Long merchantAmount;

	/**
	 * 服务费折扣标识，当前仅支持 free
	 */
	@ApiField("service_fee_discount")
	private String serviceFeeDiscount;

	/**
	 * 订单使用的券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public Long getAlipayAmount() {
		return this.alipayAmount;
	}
	public void setAlipayAmount(Long alipayAmount) {
		this.alipayAmount = alipayAmount;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getMerchantAmount() {
		return this.merchantAmount;
	}
	public void setMerchantAmount(Long merchantAmount) {
		this.merchantAmount = merchantAmount;
	}

	public String getServiceFeeDiscount() {
		return this.serviceFeeDiscount;
	}
	public void setServiceFeeDiscount(String serviceFeeDiscount) {
		this.serviceFeeDiscount = serviceFeeDiscount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
