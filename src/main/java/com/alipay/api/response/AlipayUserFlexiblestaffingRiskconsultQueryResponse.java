package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConsultParticipant;
import com.alipay.api.domain.EnterpriseInfo;
import com.alipay.api.domain.RiskConsultResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.flexiblestaffing.riskconsult.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-22 11:21:46
 */
public class AlipayUserFlexiblestaffingRiskconsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4372269845792578524L;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 计费类型，有限枚举：
1.CHARGE（收费）
2.NO_CHARGE（不计费）
	 */
	@ApiField("charge_type")
	private String chargeType;

	/** 
	 * 咨询参与方信息
	 */
	@ApiField("consult_party")
	private ConsultParticipant consultParty;

	/** 
	 * 企业信息
	 */
	@ApiField("enterprise_info")
	private EnterpriseInfo enterpriseInfo;

	/** 
	 * 咨询外部单号，和接口输入的外部单号保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 风险咨询结果集
	 */
	@ApiListField("risk_results")
	@ApiField("risk_consult_result")
	private List<RiskConsultResult> riskResults;

	/** 
	 * 建议风险
	 */
	@ApiField("suggest_risk")
	private String suggestRisk;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public String getChargeType( ) {
		return this.chargeType;
	}

	public void setConsultParty(ConsultParticipant consultParty) {
		this.consultParty = consultParty;
	}
	public ConsultParticipant getConsultParty( ) {
		return this.consultParty;
	}

	public void setEnterpriseInfo(EnterpriseInfo enterpriseInfo) {
		this.enterpriseInfo = enterpriseInfo;
	}
	public EnterpriseInfo getEnterpriseInfo( ) {
		return this.enterpriseInfo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setRiskResults(List<RiskConsultResult> riskResults) {
		this.riskResults = riskResults;
	}
	public List<RiskConsultResult> getRiskResults( ) {
		return this.riskResults;
	}

	public void setSuggestRisk(String suggestRisk) {
		this.suggestRisk = suggestRisk;
	}
	public String getSuggestRisk( ) {
		return this.suggestRisk;
	}

}
