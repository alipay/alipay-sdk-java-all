package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskApplyConsult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.flexiblestaffing.riskconsult.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-14 12:51:48
 */
public class AlipayUserFlexiblestaffingRiskconsultApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4212999648326377836L;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 计费类型，有限枚举： 1.CHARGE（收费）
	 */
	@ApiField("charge_type")
	private String chargeType;

	/** 
	 * 咨询申请的外部单号，幂等参数
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
	@ApiField("risk_apply_consult")
	private List<RiskApplyConsult> riskResults;

	/** 
	 * 建议风险等级
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

	public void setRiskResults(List<RiskApplyConsult> riskResults) {
		this.riskResults = riskResults;
	}
	public List<RiskApplyConsult> getRiskResults( ) {
		return this.riskResults;
	}

	public void setSuggestRisk(String suggestRisk) {
		this.suggestRisk = suggestRisk;
	}
	public String getSuggestRisk( ) {
		return this.suggestRisk;
	}

}
