package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.delete response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-24 10:55:33
 */
public class AlipayInsScenePetprofilePlatformprofileDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4755546548645327328L;

	/** 
	 * 删除结果，true表示成功，false表示失败
	 */
	@ApiField("delete_result")
	private Boolean deleteResult;

	public void setDeleteResult(Boolean deleteResult) {
		this.deleteResult = deleteResult;
	}
	public Boolean getDeleteResult( ) {
		return this.deleteResult;
	}

}
