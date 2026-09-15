package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpay.charge.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 00:42:50
 */
public class AlipayAipayNowpayChargeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8784652683312381874L;

	/** 
	 * 最新状态ENABLED/DISABLED
	 */
	@ApiField("capability_status")
	private String capabilityStatus;

	/** 
	 * 是否实际发生状态变化
	 */
	@ApiField("changed")
	private Boolean changed;

	/** 
	 * 展示说明
	 */
	@ApiField("reason_message")
	private String reasonMessage;

	/** 
	 * 最新状态版本
	 */
	@ApiField("status_version")
	private Long statusVersion;

	public void setCapabilityStatus(String capabilityStatus) {
		this.capabilityStatus = capabilityStatus;
	}
	public String getCapabilityStatus( ) {
		return this.capabilityStatus;
	}

	public void setChanged(Boolean changed) {
		this.changed = changed;
	}
	public Boolean getChanged( ) {
		return this.changed;
	}

	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
	}
	public String getReasonMessage( ) {
		return this.reasonMessage;
	}

	public void setStatusVersion(Long statusVersion) {
		this.statusVersion = statusVersion;
	}
	public Long getStatusVersion( ) {
		return this.statusVersion;
	}

}
