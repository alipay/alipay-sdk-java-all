package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷脸用户信息查询
 *
 * @author auto create
 * @since 1.0, 2025-05-29 15:57:08
 */
public class AlipayCommerceEducateSceneUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5827348123775786828L;

	/**
	 * 开通人绑定的支付宝openid
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
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。{1:居民身份证；A:护照；X:学工号}
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 学生（教职工）的刷脸openId。刷脸openId与用户三要素二选一，都传优先使用刷脸openId
	 */
	@ApiField("face_open_id")
	private String faceOpenId;

	/**
	 * 学生（教职工）的刷脸UID。刷脸UID与用户三要素二选一，都传优先使用刷脸UID
	 */
	@ApiField("face_user_id")
	private String faceUserId;

	/**
	 * 刷脸用户姓名
	 */
	@ApiField("name")
	private String name;

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

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
