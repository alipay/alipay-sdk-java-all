package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期计划详情
 *
 * @author auto create
 * @since 1.0, 2024-09-29 21:27:45
 */
public class InstallmentPlanPromoDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1838738368187118299L;

	/**
	 * 商家优惠金额，不区分出资方式，单位元
	 */
	@ApiField("merchant_promo_amount")
	private String merchantPromoAmount;

	/**
	 * 商家优惠详情
	 */
	@ApiField("merchant_promo_detail")
	private MerchantPromoDetailInfoVO merchantPromoDetail;

	/**
	 * 计划付款金额
	 */
	@ApiField("plan_pay_amount")
	private String planPayAmount;

	/**
	 * 对应当前阶段的分期期数，如1、2
	 */
	@ApiField("plan_pay_no")
	private String planPayNo;

	/**
	 * 平台优惠金额，不区分出资方式，单位元
	 */
	@ApiField("platform_promo_amount")
	private String platformPromoAmount;

	/**
	 * 平台优惠详情
	 */
	@ApiField("platform_promo_detail")
	private PlatformPromoDetailInfoVO platformPromoDetail;

	/**
	 * 优惠金额
	 */
	@ApiField("promo_amount")
	private String promoAmount;

	public String getMerchantPromoAmount() {
		return this.merchantPromoAmount;
	}
	public void setMerchantPromoAmount(String merchantPromoAmount) {
		this.merchantPromoAmount = merchantPromoAmount;
	}

	public MerchantPromoDetailInfoVO getMerchantPromoDetail() {
		return this.merchantPromoDetail;
	}
	public void setMerchantPromoDetail(MerchantPromoDetailInfoVO merchantPromoDetail) {
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

	public PlatformPromoDetailInfoVO getPlatformPromoDetail() {
		return this.platformPromoDetail;
	}
	public void setPlatformPromoDetail(PlatformPromoDetailInfoVO platformPromoDetail) {
		this.platformPromoDetail = platformPromoDetail;
	}

	public String getPromoAmount() {
		return this.promoAmount;
	}
	public void setPromoAmount(String promoAmount) {
		this.promoAmount = promoAmount;
	}

}
