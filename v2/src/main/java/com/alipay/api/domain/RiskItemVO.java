package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:25
 */
public class RiskItemVO extends AlipayObject {

	private static final long serialVersionUID = 8423217999453543937L;

	/**
	 * 命中的风险详细信息
	 */
	@ApiField("hit_detail")
	private String hitDetail;

	/**
	 * 风险编码
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 【订单维度共租风险】low / mid / high；
【小程序维度共租风险:】P1 ~ P6，数字越大风险越高；
【高风险黑名单】true-命中黑名单 false-未命中；
【低风险推荐发货】true-推荐发货 false-非推荐发货用户，需要商家综合其他信息自主决策；
	 */
	@ApiField("risk_level")
	private String riskLevel;

	public String getHitDetail() {
		return this.hitDetail;
	}
	public void setHitDetail(String hitDetail) {
		this.hitDetail = hitDetail;
	}

	public String getRiskCode() {
		return this.riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

}
