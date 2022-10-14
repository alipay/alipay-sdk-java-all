package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-28 16:54:10
 */
public class AlipayInsScenePetprofilePlatformprofileIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5152342562162973698L;

	/** 
	 * 核身结果，true表示同一只宠物，false表示非同一只宠物。
	 */
	@ApiField("verify_result")
	private Boolean verifyResult;

	public void setVerifyResult(Boolean verifyResult) {
		this.verifyResult = verifyResult;
	}
	public Boolean getVerifyResult( ) {
		return this.verifyResult;
	}

}
