package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 15:02:36
 */
public class AlipayInsScenePetprofilePlatformprofileModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1759686781353768594L;

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
