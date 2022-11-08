package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家人群中用户信息 
-注意：商家会员专用，禁止滥用，因模型升级造成的兼容性问题，后果自负

 *
 * @author auto create
 * @since 1.0, 2022-08-01 20:56:47
 */
public class QipanMerchantCrowdUser extends AlipayObject {

	private static final long serialVersionUID = 4263834488939875623L;

	/**
	 * 用户身份信息密文，加密方式如下： 
当encrypt_identity_type = 'mobile'时 encrypt_identity_id = sha256(手机号码); 
当encrypt_identity_type = 'email'时 encrypt_identity_id = sha256(邮箱)
	 */
	@ApiField("encrypt_identity_id")
	private String encryptIdentityId;

	/**
	 * 用身份信息类型-手机号、邮箱，枚举如下： mobile-手机号码，email-邮箱
	 */
	@ApiField("encrypt_identity_type")
	private String encryptIdentityType;

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
