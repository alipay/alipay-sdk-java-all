package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.opengreen.energy.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:02:00
 */
public class AlipaySocialOpengreenEnergyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6854993142143921821L;

	/** 
	 * 查询所获得的能量信息
	 */
	@ApiField("energy_info")
	private String energyInfo;

	/** 
	 * 错误码，查询结果中每个场景对应的错误码信息，可能为空
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 所有场景都查询成功，即为true，否则为false
	 */
	@ApiField("success")
	private String success;

	public void setEnergyInfo(String energyInfo) {
		this.energyInfo = energyInfo;
	}
	public String getEnergyInfo( ) {
		return this.energyInfo;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
