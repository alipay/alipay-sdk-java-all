package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期计划详情
 *
 * @author auto create
 * @since 1.0, 2025-07-16 13:39:50
 */
public class RentInstallmentPlanPromoDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6112382665338582534L;

	/**
	 * 商家优惠金额，不区分出资方式，单位：元，精确到小数点后两位
	 */
	@ApiField("merchant_promo_amount")
	private String merchantPromoAmount;

	/**
	 * 商家优惠详情
	 */
	@ApiField("merchant_promo_detail")
	private RentMerchantPromoDetailInfoVO merchantPromoDetail;

	/**
	 * 计划付款金额，单位：元，精确到小数点后两位
	 */
	@ApiField("plan_pay_amount")
	private String planPayAmount;

	/**
	 * 对应当前阶段的分期期数，如1、2
	 */
	@ApiField("plan_pay_no")
	private String planPayNo;

	/**
	 * 平台优惠金额，不区分出资方式，单位：元，精确到小数点后两位
	 */
	@ApiField("platform_promo_amount")
	private String platformPromoAmount;

	/**
	 * 平台优惠详情
	 */
	@ApiField("platform_promo_detail")
	private RentPlatformPromoDetailInfoVO platformPromoDetail;

	/**
	 * 优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("promo_amount")
	private String promoAmount;

	public String getMerchantPromoAmount() {
		return this.merchantPromoAmount;
	}
	public void setMerchantPromoAmount(String merchantPromoAmount) {
		this.merchantPromoAmount = merchantPromoAmount;
	}

	public RentMerchantPromoDetailInfoVO getMerchantPromoDetail() {
		return this.merchantPromoDetail;
	}
	public void setMerchantPromoDetail(RentMerchantPromoDetailInfoVO merchantPromoDetail) {
		this.merchantPromoDetail = merchantPromoDetail;
	}

	public String getPlanPayAmount() {
		return this.planPayAmount;
	}
	public void setPlanPayAmount(String planPayAmount) {
		this.planPayAmount = planPayAmount;
	}

	public String getPlanPayNo() {
		return this.planPayNo;
	}
	public void setPlanPayNo(String planPayNo) {
		this.planPayNo = planPayNo;
	}

	public String getPlatformPromoAmount() {
		return this.platformPromoAmount;
	}
	public void setPlatformPromoAmount(String platformPromoAmount) {
		this.platformPromoAmount = platformPromoAmount;
	}

	public RentPlatformPromoDetailInfoVO getPlatformPromoDetail() {
		return this.platformPromoDetail;
	}
	public void setPlatformPromoDetail(RentPlatformPromoDetailInfoVO platformPromoDetail) {
		this.platformPromoDetail = platformPromoDetail;
	}

	public String getPromoAmount() {
		return this.promoAmount;
	}
	public void setPromoAmount(String promoAmount) {
		this.promoAmount = promoAmount;
	}

}
