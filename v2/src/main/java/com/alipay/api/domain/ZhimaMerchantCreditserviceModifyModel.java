package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻信用信用服务版本修改
 *
 * @author auto create
 * @since 1.0, 2025-07-16 16:34:24
 */
public class ZhimaMerchantCreditserviceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5541677523556444757L;

	/**
	 * 信用服务基础信息配置，为必传字段。此字段为复杂模型，其中服务名称和服务logo为必传属性。
	 */
	@ApiField("base_info_config")
	private BaseInfoApiConfig baseInfoConfig;

	/**
	 * 信用服务ID，通过zhima.merchant.creditservice.create(芝麻信用信用服务创建)接口创建信用服务后获取。
	 */
	@ApiField("credit_service_id")
	private String creditServiceId;

	/**
	 * 多评估方案信用服务风控配置。此字段为复杂模型。
	 */
	@ApiListField("evaluation_risk_configs")
	@ApiField("risk_api_config")
	private List<RiskApiConfig> evaluationRiskConfigs;

	/**
	 * 拓展字段
	 */
	@ApiField("ext_info_config")
	private ExtInfoApiConfig extInfoConfig;

	/**
	 * 信用服务守护配置，为必传字段。此字段为复杂模型，其中商户服务电话为必传属性
	 */
	@ApiField("promise_config")
	private PromiseApiConfig promiseConfig;

	/**
	 * 信用服务风控配置，为必传字段。此字段为复杂模型，其中类目code为必传属性。
	 */
	@ApiField("risk_config")
	private RiskApiConfig riskConfig;

	public BaseInfoApiConfig getBaseInfoConfig() {
		return this.baseInfoConfig;
	}
	public void setBaseInfoConfig(BaseInfoApiConfig baseInfoConfig) {
		this.baseInfoConfig = baseInfoConfig;
	}

	public String getCreditServiceId() {
		return this.creditServiceId;
	}
	public void setCreditServiceId(String creditServiceId) {
		this.creditServiceId = creditServiceId;
	}

	public List<RiskApiConfig> getEvaluationRiskConfigs() {
		return this.evaluationRiskConfigs;
	}
	public void setEvaluationRiskConfigs(List<RiskApiConfig> evaluationRiskConfigs) {
		this.evaluationRiskConfigs = evaluationRiskConfigs;
	}

	public ExtInfoApiConfig getExtInfoConfig() {
		return this.extInfoConfig;
	}
	public void setExtInfoConfig(ExtInfoApiConfig extInfoConfig) {
		this.extInfoConfig = extInfoConfig;
	}

	public PromiseApiConfig getPromiseConfig() {
		return this.promiseConfig;
	}
	public void setPromiseConfig(PromiseApiConfig promiseConfig) {
		this.promiseConfig = promiseConfig;
	}

	public RiskApiConfig getRiskConfig() {
		return this.riskConfig;
	}
	public void setRiskConfig(RiskApiConfig riskConfig) {
		this.riskConfig = riskConfig;
	}

}
