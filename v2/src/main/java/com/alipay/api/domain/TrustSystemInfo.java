package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信系统信息
 *
 * @author auto create
 * @since 1.0, 2024-07-19 15:27:47
 */
public class TrustSystemInfo extends AlipayObject {

	private static final long serialVersionUID = 8115554531175321931L;

	/**
	 * 是否可调节
	 */
	@ApiField("adjustable")
	private Boolean adjustable;

	/**
	 * 充电系统信息
	 */
	@ApiField("charge_system_info")
	private ChargeSystemInfo chargeSystemInfo;

	/**
	 * 系统状态
	 */
	@ApiField("system_status")
	private String systemStatus;

	/**
	 * 能源系统类型
	 */
	@ApiField("system_type")
	private String systemType;

	public Boolean getAdjustable() {
		return this.adjustable;
	}
	public void setAdjustable(Boolean adjustable) {
		this.adjustable = adjustable;
	}

	public ChargeSystemInfo getChargeSystemInfo() {
		return this.chargeSystemInfo;
	}
	public void setChargeSystemInfo(ChargeSystemInfo chargeSystemInfo) {
		this.chargeSystemInfo = chargeSystemInfo;
	}

	public String getSystemStatus() {
		return this.systemStatus;
	}
	public void setSystemStatus(String systemStatus) {
		this.systemStatus = systemStatus;
	}

	public String getSystemType() {
		return this.systemType;
	}
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

}
