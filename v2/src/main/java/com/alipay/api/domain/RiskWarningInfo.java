package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连解决方案风险提示信息
 *
 * @author auto create
 * @since 1.0, 2026-08-03 15:06:41
 */
public class RiskWarningInfo extends AlipayObject {

	private static final long serialVersionUID = 4838652383829358129L;

	/**
	 * 当前状态描述
	 */
	@ApiField("current_status")
	private String currentStatus;

	/**
	 * 风险等级描述
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * source服务商名称
	 */
	@ApiField("source_name")
	private String sourceName;

	/**
	 * source服务商pid
	 */
	@ApiField("source_pid")
	private String sourcePid;

	public String getCurrentStatus() {
		return this.currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getSourceName() {
		return this.sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSourcePid() {
		return this.sourcePid;
	}
	public void setSourcePid(String sourcePid) {
		this.sourcePid = sourcePid;
	}

}
