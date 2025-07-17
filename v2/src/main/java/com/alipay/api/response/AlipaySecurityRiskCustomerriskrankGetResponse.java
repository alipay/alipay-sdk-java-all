package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskRankInfoCode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.customerriskrank.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipaySecurityRiskCustomerriskrankGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5412574566511466718L;

	/** 
	 * 是否有风险
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	/** 
	 * 返回本次模型的infocode
	 */
	@ApiListField("info_code")
	@ApiField("risk_rank_info_code")
	private List<RiskRankInfoCode> infoCode;

	/** 
	 * 风险等级
	 */
	@ApiField("risk_rank")
	private Long riskRank;

	/** 
	 * 分数
	 */
	@ApiField("risk_score")
	private Long riskScore;

	public void setHasRisk(Boolean hasRisk) {
		this.hasRisk = hasRisk;
	}
	public Boolean getHasRisk( ) {
		return this.hasRisk;
	}

	public void setInfoCode(List<RiskRankInfoCode> infoCode) {
		this.infoCode = infoCode;
	}
	public List<RiskRankInfoCode> getInfoCode( ) {
		return this.infoCode;
	}

	public void setRiskRank(Long riskRank) {
		this.riskRank = riskRank;
	}
	public Long getRiskRank( ) {
		return this.riskRank;
	}

	public void setRiskScore(Long riskScore) {
		this.riskScore = riskScore;
	}
	public Long getRiskScore( ) {
		return this.riskScore;
	}

}
