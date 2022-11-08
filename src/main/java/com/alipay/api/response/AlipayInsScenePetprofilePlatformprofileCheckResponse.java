package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.petprofile.platformprofile.check response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-01 16:47:51
 */
public class AlipayInsScenePetprofilePlatformprofileCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2597874637297418784L;

	/** 
	 * 宠物照片核验通过后获取的照片URL
	 */
	@ApiField("file_url")
	private String fileUrl;

	/** 
	 * 宠物照片校验结果描述
	 */
	@ApiField("verify_desc")
	private String verifyDesc;

	/** 
	 * 宠物照片校验结果
	 */
	@ApiField("verify_result")
	private Boolean verifyResult;

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

	public void setVerifyDesc(String verifyDesc) {
		this.verifyDesc = verifyDesc;
	}
	public String getVerifyDesc( ) {
		return this.verifyDesc;
	}

	public void setVerifyResult(Boolean verifyResult) {
		this.verifyResult = verifyResult;
	}
	public Boolean getVerifyResult( ) {
		return this.verifyResult;
	}

}
