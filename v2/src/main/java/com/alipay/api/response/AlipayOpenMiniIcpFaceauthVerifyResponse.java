package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.icp.faceauth.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-29 10:31:58
 */
public class AlipayOpenMiniIcpFaceauthVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3113262529535593658L;

	/** 
	 * 人脸核验的凭证
	 */
	@ApiField("certify_id")
	private String certifyId;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

}
