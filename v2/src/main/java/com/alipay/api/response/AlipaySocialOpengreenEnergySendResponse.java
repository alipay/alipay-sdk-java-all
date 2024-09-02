package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.opengreen.energy.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:56:44
 */
public class AlipaySocialOpengreenEnergySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7152811579338683218L;

	/** 
	 * 是否所有行为能量都发放成功了
	 */
	@ApiField("all_success")
	private Boolean allSuccess;

	/** 
	 * 能量生成失败的信息，当某一个行为不能产生能量的时候会返回不能产生的原因，对于描述信息可参考接口文档信息
	 */
	@ApiField("energy_generate_error_code")
	private String energyGenerateErrorCode;

	/** 
	 * 能量产生结果，根据入参传入绿色行为的个数返回每一个绿色行为产生的结果，可能为空，代表对应行为未产生能量，未产生能量的原因请参考错误码信息
	 */
	@ApiField("energy_generate_info")
	private String energyGenerateInfo;

	public void setAllSuccess(Boolean allSuccess) {
		this.allSuccess = allSuccess;
	}
	public Boolean getAllSuccess( ) {
		return this.allSuccess;
	}

	public void setEnergyGenerateErrorCode(String energyGenerateErrorCode) {
		this.energyGenerateErrorCode = energyGenerateErrorCode;
	}
	public String getEnergyGenerateErrorCode( ) {
		return this.energyGenerateErrorCode;
	}

	public void setEnergyGenerateInfo(String energyGenerateInfo) {
		this.energyGenerateInfo = energyGenerateInfo;
	}
	public String getEnergyGenerateInfo( ) {
		return this.energyGenerateInfo;
	}

}
