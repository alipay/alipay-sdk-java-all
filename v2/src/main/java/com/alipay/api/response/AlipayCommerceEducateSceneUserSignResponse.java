package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.user.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:36:58
 */
public class AlipayCommerceEducateSceneUserSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3452723612499656193L;

	/** 
	 * 支付宝为学生（教职工）生成的刷脸openId
	 */
	@ApiField("face_open_id")
	private String faceOpenId;

	/** 
	 * 支付宝为学生（教职工）生成的刷脸UID
	 */
	@ApiField("face_user_id")
	private String faceUserId;

	public void setFaceOpenId(String faceOpenId) {
		this.faceOpenId = faceOpenId;
	}
	public String getFaceOpenId( ) {
		return this.faceOpenId;
	}

	public void setFaceUserId(String faceUserId) {
		this.faceUserId = faceUserId;
	}
	public String getFaceUserId( ) {
		return this.faceUserId;
	}

}
