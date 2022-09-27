package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facepay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-27 15:05:28
 */
public class AlipayCommerceEducateFacepayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2184191368597635555L;

	/** 
	 * 申请token
	 */
	@ApiField("apply_token")
	private String applyToken;

	/** 
	 * 刷脸用户id
	 */
	@ApiField("face_uid")
	private String faceUid;

	/** 
	 * 学校外标
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}
	public String getApplyToken( ) {
		return this.applyToken;
	}

	public void setFaceUid(String faceUid) {
		this.faceUid = faceUid;
	}
	public String getFaceUid( ) {
		return this.faceUid;
	}

	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}
	public String getSchoolStdcode( ) {
		return this.schoolStdcode;
	}

}
