package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:09:54
 */
public class AlipayInsScenePetprofilePlatformprofileDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6183997284599147992L;

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
