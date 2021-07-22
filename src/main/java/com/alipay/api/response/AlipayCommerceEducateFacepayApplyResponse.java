package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facepay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:13
 */
public class AlipayCommerceEducateFacepayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7666428831781831238L;

	/** 
	 * 申请token
	 */
	@ApiField("apply_token")
	private String applyToken;

	/** 
	 * 采集人脸学生uid
	 */
	@ApiField("face_uid")
	private String faceUid;

	/** 
	 * 学生所在学校外标(国标码)
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
