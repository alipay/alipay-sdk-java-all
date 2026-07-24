package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁用户风险信息
 *
 * @author auto create
 * @since 1.0, 2026-06-13 15:30:55
 */
public class RentUserRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 7898424557479717816L;

	/**
	 * risk_level字段取值范围T1-T10（T1 ~ T4: 低风险；T5 ~ T6: 中风险；T7 ~ T8: 高风险；T9 ~ T10: 极高风险）
	 */
	@ApiField("comprehensive_risk_level")
	private String comprehensiveRiskLevel;

	/**
	 * 0、1、2、3、4、5，从0到5履约能力变高，风险变低
	 */
	@ApiField("credit_ability_level")
	private String creditAbilityLevel;

	/**
	 * nor-无在租订单, low-低风险, mid-中风险, high-高风险
	 */
	@ApiField("current_renting_level")
	private String currentRentingLevel;

	/**
	 * low-低风险, mid-中风险, high-高风险，sup-极高风险
	 */
	@ApiField("intermediary_level")
	private String intermediaryLevel;

	/**
	 * 优质用户推荐标识
	 */
	@ApiField("premium_user_recommend")
	private Boolean premiumUserRecommend;

	public String getComprehensiveRiskLevel() {
		return this.comprehensiveRiskLevel;
	}
	public void setComprehensiveRiskLevel(String comprehensiveRiskLevel) {
		this.comprehensiveRiskLevel = comprehensiveRiskLevel;
	}

	public String getCreditAbilityLevel() {
		return this.creditAbilityLevel;
	}
	public void setCreditAbilityLevel(String creditAbilityLevel) {
		this.creditAbilityLevel = creditAbilityLevel;
	}

	public String getCurrentRentingLevel() {
		return this.currentRentingLevel;
	}
	public void setCurrentRentingLevel(String currentRentingLevel) {
		this.currentRentingLevel = currentRentingLevel;
	}

	public String getIntermediaryLevel() {
		return this.intermediaryLevel;
	}
	public void setIntermediaryLevel(String intermediaryLevel) {
		this.intermediaryLevel = intermediaryLevel;
	}

	public Boolean getPremiumUserRecommend() {
		return this.premiumUserRecommend;
	}
	public void setPremiumUserRecommend(Boolean premiumUserRecommend) {
		this.premiumUserRecommend = premiumUserRecommend;
	}

}
