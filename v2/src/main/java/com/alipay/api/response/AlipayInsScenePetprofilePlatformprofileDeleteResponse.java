package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 20:05:14
 */
public class AlipayInsScenePetprofilePlatformprofileDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2335543747429727195L;

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
