package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.user.sign response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-24 18:02:55
 */
public class AlipayCommerceEducateSceneUserSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3463327526453199439L;

	/** 
	 * 支付宝为学生（教职工）生成的刷脸UID
	 */
	@ApiField("face_user_id")
	private String faceUserId;

	public void setFaceUserId(String faceUserId) {
		this.faceUserId = faceUserId;
	}
	public String getFaceUserId( ) {
		return this.faceUserId;
	}

}
