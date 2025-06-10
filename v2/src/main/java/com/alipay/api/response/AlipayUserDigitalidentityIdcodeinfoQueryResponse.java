package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.digitalidentity.idcodeinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:10:43
 */
public class AlipayUserDigitalidentityIdcodeinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1156956277384634347L;

	/** 
	 * 用数据提供机构RSA加密后的AES秘钥，加密后进行了Base64编码。机构的公钥请接入时商户与机构线下对接，加解密签名验签工具请接入时与支付宝端本开放能力技术负责人对接获取。当user_data不为空时必填
	 */
	@ApiField("aes_key_encrypted")
	private String aesKeyEncrypted;

	/** 
	 * 核验身份码成功后返回AES加密后的用户信息（Base64编码），解密后为Map的JSON串，具体内容格式视业务场景而不同。仅当身份码核验通过且商户拥有查询用户信息权限时该字段有值
	 */
	@ApiField("user_data")
	private String userData;

	/** 
	 * 对userData原始信息的签名。加解密签名验签工具请接入时与支付宝端本开放能力技术负责人对接获取。user_data不为空时必填
	 */
	@ApiField("user_data_sign")
	private String userDataSign;

	/** 
	 * 身份码核验结果，成功返回success，失败返回fail。
1）success：校验成功（二维码有效、正确且用户拥有该二维码）
2）fail：校验失败
	 */
	@ApiField("verify_result")
	private String verifyResult;

	public void setAesKeyEncrypted(String aesKeyEncrypted) {
		this.aesKeyEncrypted = aesKeyEncrypted;
	}
	public String getAesKeyEncrypted( ) {
		return this.aesKeyEncrypted;
	}

	public void setUserData(String userData) {
		this.userData = userData;
	}
	public String getUserData( ) {
		return this.userData;
	}

	public void setUserDataSign(String userDataSign) {
		this.userDataSign = userDataSign;
	}
	public String getUserDataSign( ) {
		return this.userDataSign;
	}

	public void setVerifyResult(String verifyResult) {
		this.verifyResult = verifyResult;
	}
	public String getVerifyResult( ) {
		return this.verifyResult;
	}

}
