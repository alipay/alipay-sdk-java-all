package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:50:05
 */
public class AlipayInsScenePetprofilePlatformprofileModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4178146399563412131L;

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
