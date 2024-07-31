package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.opengreen.energy.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:19:46
 */
public class AlipaySocialOpengreenEnergyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5836448354565369631L;

	/** 
	 * 生成能量的场景以及g数
	 */
	@ApiField("energy_generated")
	private String energyGenerated;

	/** 
	 * 失败的场景以及失败的原因
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否所有能量都发放成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setEnergyGenerated(String energyGenerated) {
		this.energyGenerated = energyGenerated;
	}
	public String getEnergyGenerated( ) {
		return this.energyGenerated;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
