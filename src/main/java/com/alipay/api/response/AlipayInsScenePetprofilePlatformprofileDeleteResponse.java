package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 16:53:40
 */
public class AlipayInsScenePetprofilePlatformprofileDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7297524342337559445L;

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
