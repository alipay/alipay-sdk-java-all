package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.openprod.token.generate response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-10 16:02:52
 */
public class AlipayInsSceneOpenprodTokenGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4569882234795632818L;

	/** 
	 * 过期时间，格式为'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("expiration")
	private Date expiration;

	/** 
	 * 加密后的身份Token，解密后包含用户真实姓名（realName）、手机号（phone）、身份证号（idCardNo）及 Token 过期时间（expireTime）四要素，均为明文。无需脱敏的原因：该 Token 采用 AES-256 加密传输，仅持有密钥的授权方（insassetprod）可解密还原；
	 */
	@ApiField("identity_token")
	private String identityToken;

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public Date getExpiration( ) {
		return this.expiration;
	}

	public void setIdentityToken(String identityToken) {
		this.identityToken = identityToken;
	}
	public String getIdentityToken( ) {
		return this.identityToken;
	}

}
