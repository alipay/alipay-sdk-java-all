package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 尚闻流量卡状态同步
 *
 * @author auto create
 * @since 1.0, 2025-05-26 14:07:24
 */
public class AlipayTerminalEdgecloudSwnetflowCardstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6665988616579784265L;

	/**
	 * 变更后卡流量状态
	 */
	@ApiField("after_os_status")
	private String afterOsStatus;

	/**
	 * 变更后卡状态
	 */
	@ApiField("after_status")
	private String afterStatus;

	/**
	 * 变更前卡流量状态
	 */
	@ApiField("before_os_status")
	private String beforeOsStatus;

	/**
	 * 变更前卡状态
	 */
	@ApiField("before_status")
	private String beforeStatus;

	/**
	 * 卡套餐周期类型，例如年包-ANNUAL，月包-MONTH
	 */
	@ApiField("biling_cycle")
	private String bilingCycle;

	/**
	 * 卡所属池凭证的套餐名称
	 */
	@ApiField("credential_name")
	private String credentialName;

	/**
	 * 卡流量的数据类型，例如：单卡通用流量、单卡运营商定向流量
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 流量卡唯一标识iccid
	 */
	@ApiField("icc_id")
	private String iccId;

	public String getAfterOsStatus() {
		return this.afterOsStatus;
	}
	public void setAfterOsStatus(String afterOsStatus) {
		this.afterOsStatus = afterOsStatus;
	}

	public String getAfterStatus() {
		return this.afterStatus;
	}
	public void setAfterStatus(String afterStatus) {
		this.afterStatus = afterStatus;
	}

	public String getBeforeOsStatus() {
		return this.beforeOsStatus;
	}
	public void setBeforeOsStatus(String beforeOsStatus) {
		this.beforeOsStatus = beforeOsStatus;
	}

	public String getBeforeStatus() {
		return this.beforeStatus;
	}
	public void setBeforeStatus(String beforeStatus) {
		this.beforeStatus = beforeStatus;
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
