package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskStrategy;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.risk.info.identify response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-05 14:02:19
 */
public class ZhimaCreditEpRiskInfoIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3741491865177713697L;

	/** 
	 * {
       // 策略名称
      "strategyName":"企业存在诉讼被告",
       // 策略显示内容
      "strategyShowContent":"企业近24个月涉及诉讼被告188次",
      // 策略命中标识
      "strategyHitFlag": true,
      // 命中策略的值
      "strategyValue":"188",
      // 策略值类型
      "strategyValueType":"LONG",
      // 策略值状态 SUCCESS/FAILURE
      "strategyValueStatus":"SUCCESS",
      // 风险等级 SIGNIFICANT_RISK/PROMPT_RISK
      "riskLevel":"SIGNIFICANT_RISK",
      // 策略id
      "strategyId":"f_rt_this_tertiary_040151",
      // 是否有详情feeds
      "hasDetail":true
    }
	 */
	@ApiListField("risk_strategy_list")
	@ApiField("risk_strategy")
	private List<RiskStrategy> riskStrategyList;

	public void setRiskStrategyList(List<RiskStrategy> riskStrategyList) {
		this.riskStrategyList = riskStrategyList;
	}
	public List<RiskStrategy> getRiskStrategyList( ) {
		return this.riskStrategyList;
	}

}
