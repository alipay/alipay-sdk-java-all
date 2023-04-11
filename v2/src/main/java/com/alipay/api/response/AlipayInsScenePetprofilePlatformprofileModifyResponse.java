package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:54:54
 */
public class AlipayInsScenePetprofilePlatformprofileModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2559978534515716375L;

	/** 
	 * 修改结果
	 */
	@ApiField("change_result")
	private Boolean changeResult;

	public void setChangeResult(Boolean changeResult) {
		this.changeResult = changeResult;
	}
	public Boolean getChangeResult( ) {
		return this.changeResult;
	}

}
