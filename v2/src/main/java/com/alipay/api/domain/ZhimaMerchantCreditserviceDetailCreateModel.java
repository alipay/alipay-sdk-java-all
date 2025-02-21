package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用信用服务创建
 *
 * @author auto create
 * @since 1.0, 2024-10-16 11:23:44
 */
public class ZhimaMerchantCreditserviceDetailCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1154961655232763319L;

	/**
	 * 信用服务基础信息配置，为必传字段。此字段为复杂模型，其中服务名称和服务logo为必传属性。
	 */
	@ApiField("base_info_config")
	private BaseInfoConfig baseInfoConfig;

	/**
	 * 业务流水号，由商户传入，为必传字段。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 信用服务创建模式，枚举如下：
* direct：直连模式。
* indirect：间连模式。
	 */
	@ApiField("create_type")
	private String createType;

	/**
	 * 创建信用服务扩展字段，为JSON字符串。
	 */
	@ApiField("extra_info")
	private String extraInfo;

	/**
	 * 信用服务守护配置，为必传字段。此字段为复杂模型，其中商户服务电话为必传属性。
	 */
	@ApiField("promise_config")
	private PromiseConfig promiseConfig;

	/**
	 * 信用服务风控配置，为必传字段。此字段为复杂模型，其中类目code为必传属性。
	 */
	@ApiField("risk_config")
	private RiskConfig riskConfig;

	/**
	 * 二级商户ID。
注意：
* create_type = indirect（间连模式创建）时本参数必填。
* create_type = direct（直连模式创建）时，请勿传入。
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 行业解决方案ID，为必传字段。
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 二级商户pid。
注意：
* create_type = indirect（间连模式创建）时，，用于查询二级商户底线风险。
* create_type = direct（直连模式创建）时，请勿传入。
	 */
	@ApiField("sub_pid")
	private String subPid;

	public BaseInfoConfig getBaseInfoConfig() {
		return this.baseInfoConfig;
	}
	public void setBaseInfoConfig(BaseInfoConfig baseInfoConfig) {
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
