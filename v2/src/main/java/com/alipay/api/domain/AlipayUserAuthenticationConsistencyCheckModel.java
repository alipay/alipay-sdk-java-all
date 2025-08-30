package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝实名信息一致性校验接口
 *
 * @author auto create
 * @since 1.0, 2025-08-07 19:13:38
 */
public class AlipayUserAuthenticationConsistencyCheckModel extends AlipayObject {

	private static final long serialVersionUID = 3622962273689877338L;

	/**
	 * 业务逻辑会针对biz_from来决定：账号属于未认证状态时是否透出错误码和错误文案
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 【证件类型】0:身份证 1:护照 2:军官证 3:士兵证 4:回乡证 5:临时身份证 6:户口簿 7:警官证 8:台胞证 9:营业执照10:其它证件 11:港澳居民来往内地通行证 12:台湾居民来往大陆通行证 13:台湾居民居住证 14:港澳居民居住证 15:港澳身份证 16:外国人永久居住证。注意：用户类型为企业或公司用户时可以不填本字段
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * T: 表示通过营业执照来核验个人账号，仅在user_type为2且cert_type为9时会消费该字段，非必填;
F: 传F或者不传，则不支持通过营业执照来核验个人账号；
默认值为F
	 */
	@ApiField("check_by_license")
	private String checkByLicense;

	/**
	 * Md5加密的证件信息，个人用户为加密的证件号码，企业类型为加密的统一信用代码;
个人用户且证件类型为营业执照时，该字段为加密的统一信用代码
	 */
	@ApiField("encrypt_code")
	private String encryptCode;

	/**
	 * 当user_type为2，cert_type为9时，即通过营业执照核验个人账号时，该字段必传
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户类型（1/2） 1代表公司账户2代表个人账户
	 */
	@ApiField("user_type")
	private String userType;

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCheckByLicense() {
		return this.checkByLicense;
	}
	public void setCheckByLicense(String checkByLicense) {
		this.checkByLicense = checkByLicense;
	}

	public String getEncryptCode() {
		return this.encryptCode;
	}
	public void setEncryptCode(String encryptCode) {
		this.encryptCode = encryptCode;
	}

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
