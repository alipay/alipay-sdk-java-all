package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.family.share.auth.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 15:07:35
 */
public class AlipayUserFamilyShareAuthCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 5182968212131458495L;

	/** 
	 * 指定资源下这两个用户是否存在共享关系
	 */
	@ApiField("has_sharing_auth")
	private Boolean hasSharingAuth;

	public void setHasSharingAuth(Boolean hasSharingAuth) {
		this.hasSharingAuth = hasSharingAuth;
	}
	public Boolean getHasSharingAuth( ) {
		return this.hasSharingAuth;
	}

}
