package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷脸用户信息关闭
 *
 * @author auto create
 * @since 1.0, 2021-12-27 11:57:40
 */
public class AlipayCommerceEducateSceneUserUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 4725546813291933958L;

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
	 * 学生（教职工）的刷脸UID
	 */
	@ApiField("face_user_id")
	private String faceUserId;

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

	public String getFaceUserId() {
		return this.faceUserId;
	}
	public void setFaceUserId(String faceUserId) {
		this.faceUserId = faceUserId;
	}

}
