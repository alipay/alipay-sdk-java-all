package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用信用服务创建
 *
 * @author auto create
 * @since 1.0, 2024-03-11 15:17:02
 */
public class ZhimaMerchantCreditserviceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5591969263666782836L;

	/**
	 * 信用服务基础信息配置，为必传字段。此字段为复杂模型，其中服务名称和服务logo为必传属性。
	 */
	@ApiField("base_info_config")
	private BaseInfoApiConfig baseInfoConfig;

	/**
	 * 业务流水号，由商户传入，为必传字段。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 信用服务创建模式，枚举如下： * DIRECT_MERCHANT：直连商户（直连模式）。 * ZFT_MERCHANT：直付通商户(间联模式)。
	 */
	@ApiField("create_type")
	private String createType;

	/**
	 * 拓展字段
	 */
	@ApiField("ext_info_config")
	private ExtInfoApiConfig extInfoConfig;

	/**
	 * 信用服务守护配置，为必传字段。此字段为复杂模型，其中商户服务电话为必传属性。
	 */
	@ApiField("promise_config")
	private PromiseApiConfig promiseConfig;

	/**
	 * 信用服务风控配置，为必传字段。此字段为复杂模型，其中类目code为必传属性。
	 */
	@ApiField("risk_config")
	private RiskApiConfig riskConfig;

	/**
	 * 二级商户ID。
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 行业解决方案ID，为必传字段，需要BD或相关产品负责人提供
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 二级商户pid
	 */
	@ApiField("sub_pid")
	private String subPid;

	public BaseInfoApiConfig getBaseInfoConfig() {
		return this.baseInfoConfig;
	}
	public void setBaseInfoConfig(BaseInfoApiConfig baseInfoConfig) {
		this.baseInfoConfig = baseInfoConfig;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCreateType() {
		return this.createType;
	}
	public void setCreateType(String createType) {
		this.createType = createType;
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

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public String getSubPid() {
		return this.subPid;
	}
	public void setSubPid(String subPid) {
		this.subPid = subPid;
	}

}
