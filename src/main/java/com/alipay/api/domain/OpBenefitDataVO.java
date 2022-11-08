package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券咨询权益
 *
 * @author auto create
 * @since 1.0, 2022-05-10 17:06:58
 */
public class OpBenefitDataVO extends AlipayObject {

	private static final long serialVersionUID = 4474199825812874866L;

	/**
	 * 权益logo
	 */
	@ApiField("benefit_logo")
	private String benefitLogo;

	/**
	 * 权益主标题
	 */
	@ApiField("benefit_main_title")
	private String benefitMainTitle;

	/**
	 * 权益商家名称
	 */
	@ApiField("benefit_merchant_name")
	private String benefitMerchantName;

	/**
	 * 权益副标题
	 */
	@ApiField("benefit_sub_title")
	private String benefitSubTitle;

	/**
	 * 品牌logo
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 距离描述
	 */
	@ApiField("distance_desc")
	private String distanceDesc;

	/**
	 * 门槛金额
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 奖品面额，精确到小数点两位。对于代金券来说是金额，对于折扣券来说是折
	 */
	@ApiField("prize")
	private String prize;

	/**
	 * 元/折
	 */
	@ApiField("prize_unit")
	private String prizeUnit;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getBenefitLogo() {
		return this.benefitLogo;
	}
	public void setBenefitLogo(String benefitLogo) {
		this.benefitLogo = benefitLogo;
	}

	public String getBenefitMainTitle() {
		return this.benefitMainTitle;
	}
	public void setBenefitMainTitle(String benefitMainTitle) {
		this.benefitMainTitle = benefitMainTitle;
	}

	public String getBenefitMerchantName() {
		return this.benefitMerchantName;
	}
	public void setBenefitMerchantName(String benefitMerchantName) {
		this.benefitMerchantName = benefitMerchantName;
	}

	public String getBenefitSubTitle() {
		return this.benefitSubTitle;
	}
	public void setBenefitSubTitle(String benefitSubTitle) {
		this.benefitSubTitle = benefitSubTitle;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getDistanceDesc() {
		return this.distanceDesc;
	}
	public void setDistanceDesc(String distanceDesc) {
		this.distanceDesc = distanceDesc;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getPrize() {
		return this.prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}

	public String getPrizeUnit() {
		return this.prizeUnit;
	}
	public void setPrizeUnit(String prizeUnit) {
		this.prizeUnit = prizeUnit;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
