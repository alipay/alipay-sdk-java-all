package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.certify.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-27 20:21:57
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3611178879355143234L;

	/** 
	 * 认证错误原因，扩展字段，默认不返回
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 刷脸用户的身份信息，目前返回为空
	 */
	@ApiField("identity_info")
	private String identityInfo;

	/** 
	 * 认证主体附件信息，主要为图片类材料，一般的认证场景都是返回空
	 */
	@ApiField("material_info")
	private String materialInfo;

	/** 
	 * 是否通过，通过为T，不通过为F
	 */
	@ApiField("passed")
	private String passed;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setIdentityInfo(String identityInfo) {
		this.identityInfo = identityInfo;
	}
	public String getIdentityInfo( ) {
		return this.identityInfo;
	}

	public void setMaterialInfo(String materialInfo) {
		this.materialInfo = materialInfo;
	}
	public String getMaterialInfo( ) {
		return this.materialInfo;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
