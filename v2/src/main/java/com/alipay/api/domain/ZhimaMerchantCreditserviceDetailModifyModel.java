package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用信用服务版本升级
 *
 * @author auto create
 * @since 1.0, 2022-11-15 10:30:42
 */
public class ZhimaMerchantCreditserviceDetailModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3642512587762257456L;

	/**
	 * 信用服务基础信息配置，为必传字段。此字段为复杂模型，其中服务名称和服务logo为必传属性。
	 */
	@ApiField("base_info_config")
	private BaseInfoConfig baseInfoConfig;

	/**
	 * 信用服务ID，通过<a href="https://opendocs.alipay.com/apis/api_8/zhima.merchant.creditservice.detail.create">zhima.merchant.creditservice.detail.create</a>(芝麻信用信用服务创建)接口创建信用服务后获取。
	 */
	@ApiField("credit_service_id")
	private String creditServiceId;

	/**
	 * 修改信用服务版本扩展字段，为JSON字符串。
	 */
	@ApiField("extra_info")
	private String extraInfo;

	/**
	 * 信用服务守护配置，为必传字段。此字段为复杂模型，其中商户服务电话为必传属性
	 */
	@ApiField("promise_config")
	private PromiseConfig promiseConfig;

	/**
	 * 信用服务风控配置，为必传字段。此字段为复杂模型，其中类目code为必传属性。
	 */
	@ApiField("risk_config")
	private RiskConfig riskConfig;

	public BaseInfoConfig getBaseInfoConfig() {
		return this.baseInfoConfig;
	}
	public void setBaseInfoConfig(BaseInfoConfig baseInfoConfig) {
		this.baseInfoConfig = baseInfoConfig;
	}

	public String getCreditServiceId() {
		return this.creditServiceId;
	}
	public void setCreditServiceId(String creditServiceId) {
		this.creditServiceId = creditServiceId;
	}

	public String getExtraInfo() {
		return this.extraInfo;
	}
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public PromiseConfig getPromiseConfig() {
		return this.promiseConfig;
	}
	public void setPromiseConfig(PromiseConfig promiseConfig) {
		this.promiseConfig = promiseConfig;
	}

	public RiskConfig getRiskConfig() {
		return this.riskConfig;
	}
	public void setRiskConfig(RiskConfig riskConfig) {
		this.riskConfig = riskConfig;
	}

}
