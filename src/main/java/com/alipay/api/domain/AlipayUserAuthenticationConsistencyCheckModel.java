package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝实名信息一致性校验接口
 *
 * @author auto create
 * @since 1.0, 2022-06-29 10:58:38
 */
public class AlipayUserAuthenticationConsistencyCheckModel extends AlipayObject {

	private static final long serialVersionUID = 3541538984319722163L;

	/**
	 * 【证件类型】0:身份证 1:护照 2:军官证 3:士兵证 4:回乡证 5:临时身份证 6:户口簿 7:警官证 8:台胞证 9:营业执照10:其它证件 11:港澳居民来往内地通行证 12:台湾居民来往大陆通行证 13:台湾居民居住证 14:港澳居民居住证 15:港澳身份证 16:外国人永久居住证。注意：用户类型为企业或公司用户时可以不填本字段
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * Md5加密的证件信息，个人用户为加密的证件号码，企业类型为加密的统一信用代码
	 */
	@ApiField("encrypt_code")
	private String encryptCode;

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

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getEncryptCode() {
		return this.encryptCode;
	}
	public void setEncryptCode(String encryptCode) {
		this.encryptCode = encryptCode;
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
