package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放认证身份参数
 *
 * @author auto create
 * @since 1.0, 2023-03-01 14:25:16
 */
public class OpenCertifyIdentityParam extends AlipayObject {

	private static final long serialVersionUID = 8422358593888163454L;

	/**
	 * cert_digest：
身份信息摘要
	 */
	@ApiField("cert_digest")
	private String certDigest;

	/**
	 * cert_name：
填入真实姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * cert_no：
填入姓名相匹配的证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * cert_type：
1、若为身份证，填IDENTITY_CARD；
2、若为港澳居民来往内地通行证，填HOME_VISIT_PERMIT_HK_MC；
3、若为台湾居民来往内地通行证，填HOME_VISIT_PERMIT_TAIWAN；
4、若为港澳居民居住证，填RESIDENCE_PERMIT_HK_MC；
5、若为台湾居民居住证，填RESIDENCE_PERMIT_TAIWAN；
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * facial_picture_front：
活体人脸图片base64串，主要用于离线人脸比对
	 */
	@ApiField("facial_picture_front")
	private String facialPictureFront;

	/**
	 * identity_type
1.若本人验证，使用CERT_INFO；
2.若代他人验证，使用AGENT_CERT_INFO；
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * open_id：
开放平台用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * phone_no：
填写姓名相匹配的手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * user_id：
支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertDigest() {
		return this.certDigest;
	}
	public void setCertDigest(String certDigest) {
		this.certDigest = certDigest;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
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

	public String getFacialPictureFront() {
		return this.facialPictureFront;
	}
	public void setFacialPictureFront(String facialPictureFront) {
		this.facialPictureFront = facialPictureFront;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
