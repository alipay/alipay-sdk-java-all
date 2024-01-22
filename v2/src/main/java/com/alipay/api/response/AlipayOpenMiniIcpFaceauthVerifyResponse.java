package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.icp.faceauth.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 18:21:57
 */
public class AlipayOpenMiniIcpFaceauthVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8693314315245183994L;

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
