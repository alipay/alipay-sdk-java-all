package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 尚闻流量卡流量使用同步
 *
 * @author auto create
 * @since 1.0, 2025-06-11 16:41:56
 */
public class AlipayTerminalEdgecloudSwnetflowCardusageSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6598313867615826635L;

	/**
	 * 上次同步时日流量，单位KB
	 */
	@ApiField("before_day_usage")
	private String beforeDayUsage;

	/**
	 * 上次同步月流量，单位KB。
	 */
	@ApiField("before_month_usage")
	private String beforeMonthUsage;

	/**
	 * 卡池套餐周期，例如年包，月包
	 */
	@ApiField("biling_cycle")
	private String bilingCycle;

	/**
	 * 卡池套餐名称，包含档位信息
	 */
	@ApiField("credential_name")
	private String credentialName;

	/**
	 * 当前日流量，单位KB。
	 */
	@ApiField("current_day_usage")
	private String currentDayUsage;

	/**
	 * 当前月流量，单位KB。
	 */
	@ApiField("current_month_usage")
	private String currentMonthUsage;

	/**
	 * 卡池套餐档位信息，例如：单卡通用流量、单卡运营商定向流量
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 流量卡id
	 */
	@ApiField("icc_id")
	private String iccId;

	public String getBeforeDayUsage() {
		return this.beforeDayUsage;
	}
	public void setBeforeDayUsage(String beforeDayUsage) {
		this.beforeDayUsage = beforeDayUsage;
	}

	public String getBeforeMonthUsage() {
		return this.beforeMonthUsage;
	}
	public void setBeforeMonthUsage(String beforeMonthUsage) {
		this.beforeMonthUsage = beforeMonthUsage;
	}

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

	public String getCurrentDayUsage() {
		return this.currentDayUsage;
	}
	public void setCurrentDayUsage(String currentDayUsage) {
		this.currentDayUsage = currentDayUsage;
	}

	public String getCurrentMonthUsage() {
		return this.currentMonthUsage;
	}
	public void setCurrentMonthUsage(String currentMonthUsage) {
		this.currentMonthUsage = currentMonthUsage;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getIccId() {
		return this.iccId;
	}
	public void setIccId(String iccId) {
		this.iccId = iccId;
	}

}
