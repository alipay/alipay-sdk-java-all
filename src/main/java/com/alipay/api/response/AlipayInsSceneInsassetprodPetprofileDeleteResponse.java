package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insassetprod.petprofile.delete response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-21 20:10:36
 */
public class AlipayInsSceneInsassetprodPetprofileDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4162324758246881259L;

	/** 
	 * 删除档案结果
	 */
	@ApiField("delete_flag")
	private Boolean deleteFlag;

	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public Boolean getDeleteFlag( ) {
		return this.deleteFlag;
	}

}
