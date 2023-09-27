package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷脸用户信息关闭
 *
 * @author auto create
 * @since 1.0, 2022-11-17 14:53:48
 */
public class AlipayCommerceEducateSceneUserUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 3739377138781312414L;

	/**
	 * 开通人绑定的支付宝openId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝学校内标
	 */
	@ApiField("alipay_school_id")
	private String alipaySchoolId;

	/**
	 * 开通人绑定的支付宝UID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 学生（教职工）的刷脸openId
	 */
	@ApiField("face_open_id")
	private String faceOpenId;

	/**
	 * 学生（教职工）的刷脸UID
	 */
	@ApiField("face_user_id")
	private String faceUserId;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipaySchoolId() {
		return this.alipaySchoolId;
	}
	public void setAlipaySchoolId(String alipaySchoolId) {
		this.alipaySchoolId = alipaySchoolId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getFaceOpenId() {
		return this.faceOpenId;
	}
	public void setFaceOpenId(String faceOpenId) {
		this.faceOpenId = faceOpenId;
	}

	public String getFaceUserId() {
		return this.faceUserId;
	}
	public void setFaceUserId(String faceUserId) {
		this.faceUserId = faceUserId;
	}

}
