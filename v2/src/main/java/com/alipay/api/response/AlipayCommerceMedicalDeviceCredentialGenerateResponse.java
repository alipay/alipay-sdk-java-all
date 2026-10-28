package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceIdentityCredentialOpenApiGenerateResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.device.credential.generate response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-21 16:37:54
 */
public class AlipayCommerceMedicalDeviceCredentialGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3642716744855258967L;

	/** 
	 * 剩余额度(个)
	 */
	@ApiField("remaining_quota")
	private Long remainingQuota;

	/** 
	 * null
	 */
	@ApiListField("results")
	@ApiField("device_identity_credential_open_api_generate_result")
	private List<DeviceIdentityCredentialOpenApiGenerateResult> results;

	public void setRemainingQuota(Long remainingQuota) {
		this.remainingQuota = remainingQuota;
	}
	public Long getRemainingQuota( ) {
		return this.remainingQuota;
	}

	public void setResults(List<DeviceIdentityCredentialOpenApiGenerateResult> results) {
		this.results = results;
	}
	public List<DeviceIdentityCredentialOpenApiGenerateResult> getResults( ) {
		return this.results;
	}

}
