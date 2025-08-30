package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 尚闻流量池流量使用情况同步
 *
 * @author auto create
 * @since 1.0, 2025-05-26 14:05:48
 */
public class AlipayTerminalEdgecloudSwnetflowPoolusageSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6658773676288241451L;

	/**
	 * 池套餐周期类型，例如年包，月包
	 */
	@ApiField("biling_cycle")
	private String bilingCycle;

	/**
	 * 池凭证的套餐名称，用于获取档位信息
	 */
	@ApiField("credential_name")
	private String credentialName;

	/**
	 * 流量的数据类型，例如：单卡通用流量、单卡运营商定向流量
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 流量卡池id
	 */
	@ApiField("pool_id")
	private String poolId;

	/**
	 * 池剩余流量，单位KB。
	 */
	@ApiField("rest_flow")
	private String restFlow;

	/**
	 * 池总流量，单位KB。
	 */
	@ApiField("total_flow")
	private String totalFlow;

	/**
	 * 池使用率，保留2位小数
	 */
	@ApiField("usage_ratio")
	private String usageRatio;

	public String getBilingCycle() {
		return this.bilingCycle;
	}
	public void setBilingCycle(String bilingCycle) {
		this.bilingCycle = bilingCycle;
	}

	public String getCredentialName() {
		return this.credentialName;
	}
	public void setCredentialName(String credentialName) {
		this.credentialName = credentialName;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getPoolId() {
		return this.poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

	public String getRestFlow() {
		return this.restFlow;
	}
	public void setRestFlow(String restFlow) {
		this.restFlow = restFlow;
	}

	public String getTotalFlow() {
		return this.totalFlow;
	}
	public void setTotalFlow(String totalFlow) {
		this.totalFlow = totalFlow;
	}

	public String getUsageRatio() {
		return this.usageRatio;
	}
	public void setUsageRatio(String usageRatio) {
		this.usageRatio = usageRatio;
	}

}
