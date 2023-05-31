package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家人群中用户信息 
-注意：商家会员专用，禁止滥用，因模型升级造成的兼容性问题，后果自负

 *
 * @author auto create
 * @since 1.0, 2023-03-19 16:32:00
 */
public class QipanMerchantCrowdUser extends AlipayObject {

	private static final long serialVersionUID = 4796915156844319858L;

	/**
	 * 支付宝小程序app_id，当encrypt_identity_type=OPEN_ID此值必传，且应传入openId对应的appId
	 */
	@ApiField("alipay_app_id")
	private String alipayAppId;

	/**
	 * 用户身份信息为手机号码时，加密方式如下： encrypt_identity_type=SHA256_MOBILE，encrypt_identity_id = sha256(手机号码) 

用户身份信息为支付宝openId时，加密方式如下： encrypt_identity_type=OPEN_ID，encrypt_identity_id = 支付宝openId 

用户身份信息为idfa时，加密方式如下： encrypt_identity_type=SHA256_IDFA，encrypt_identity_id = sha256(idfa)

用户身份信息为oaid时，加密方式如下： encrypt_identity_type=SHA256_OAID，encrypt_identity_id = sha256(oaid)
	 */
	@ApiField("encrypt_identity_id")
	private String encryptIdentityId;

	/**
	 * 用身份信息类型-加密手机号，枚举如下： 
SHA256_MOBILE-sha256加密的手机号码
OPEN_ID-支付宝openId
SHA256_IDFA-sha256加密的idfa
SHA256_OAID-sha256加密的oaid
	 */
	@ApiField("encrypt_identity_type")
	private String encryptIdentityType;

	public String getAlipayAppId() {
		return this.alipayAppId;
	}
	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getEncryptIdentityId() {
		return this.encryptIdentityId;
	}
	public void setEncryptIdentityId(String encryptIdentityId) {
		this.encryptIdentityId = encryptIdentityId;
	}

	public String getEncryptIdentityType() {
		return this.encryptIdentityType;
	}
	public void setEncryptIdentityType(String encryptIdentityType) {
		this.encryptIdentityType = encryptIdentityType;
	}

}
