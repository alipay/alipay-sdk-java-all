package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁用户风险信息
 *
 * @author auto create
 * @since 1.0, 2026-04-24 10:13:52
 */
public class RentUserRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 2388129331235321315L;

	/**
	 * risk_level字段取值范围T1-T10（T1 ~ T4: 低风险；T5 ~ T6: 中风险；T7 ~ T8: 高风险；T9 ~ T10: 极高风险）
	 */
	@ApiField("comprehensive_risk_level")
	private String comprehensiveRiskLevel;

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

	public Boolean getPremiumUserRecommend() {
		return this.premiumUserRecommend;
	}
	public void setPremiumUserRecommend(Boolean premiumUserRecommend) {
		this.premiumUserRecommend = premiumUserRecommend;
	}

}
