package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.deviceinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-09 10:06:57
 */
public class AlipaySecurityRiskDeviceinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5436757242554766411L;

	/** 
	 * 设备原子风险
	 */
	@ApiField("atomic_risk")
	private String atomicRisk;

	public void setAtomicRisk(String atomicRisk) {
		this.atomicRisk = atomicRisk;
	}
	public String getAtomicRisk( ) {
		return this.atomicRisk;
	}

}
